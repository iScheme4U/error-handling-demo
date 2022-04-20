package com.soulcraft.demo.errorhandling.demo5.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.soulcraft.demo.errorhandling.demo5.exception.UserResponse;
import com.soulcraft.demo.errorhandling.demo5.resp.Response;
import com.soulcraft.demo.errorhandling.demo5.resp.page.PageQuery;
import com.soulcraft.demo.errorhandling.demo5.resp.page.PageResponse;
import com.soulcraft.demo.errorhandling.demo5.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * User controller
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@RestController
@Tag(name = "User")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Login")
    @GetMapping(value = "/login")
    public Response login(@RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password) {
        boolean result = userService.login(username, password);
        if (result) {
            return Response.success();
        }
        return Response.failed(UserResponse.USER_LOGIN_FAILED);
    }

    @Operation(summary="list users")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Response<PageResponse<String>> list(PageQuery qo) {
        IPage<String> userList = userService.list(qo);
        return Response.success(PageResponse.restPage(userList));
    }

}

