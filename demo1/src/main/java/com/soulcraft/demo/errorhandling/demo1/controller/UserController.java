package com.soulcraft.demo.errorhandling.demo1.controller;


import com.soulcraft.demo.errorhandling.demo1.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

//    @GetMapping(value = "/login")
//    @ResponseBody
    public String loginWithTryCatch(@RequestParam(value = "username") String username,
                                    @RequestParam(value = "password") String password) {
        try {
            boolean result = userService.login(username, password);
            if (result) {
                return "success";
            }
        } catch (Exception e) {
            return "failure:" + e.getMessage();
        }
        return "failure";
    }

    @Operation(summary = "Login")
    @GetMapping(value = "/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password) {
        boolean result = userService.login(username, password);
        if (result) {
            return "success";
        }
        return "failure";
    }

}

