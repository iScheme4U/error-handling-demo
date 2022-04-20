package com.soulcraft.demo.errorhandling.demo5.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soulcraft.demo.errorhandling.demo5.exception.UserResponse;
import com.soulcraft.demo.errorhandling.demo5.resp.page.PageQuery;
import com.soulcraft.demo.errorhandling.demo5.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * User service implementation
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String username, String password) {
        UserResponse.USERNAME_CANNOT_BE_EMPTY.assertStringNotEmpty(username);
        UserResponse.PASSWORD_CANNOT_BE_EMPTY.assertStringNotEmpty(password);
        boolean validated = "admin".equals(username) && "123456".equals(password);
        UserResponse.USER_LOGIN_FAILED.assertTrue(validated);
        return true;
    }

    @Override
    public IPage<String> list(PageQuery qo) {
        Page<String> page = new Page<>(qo.getPageNum(), qo.getPageSize());
        List<String> users = new ArrayList<>();
        for (int index = 1; index <= 5; ++index) {
            users.add(String.valueOf(index));
        }
        page.setTotal(users.size()).setRecords(users);
        return page;
    }
}
