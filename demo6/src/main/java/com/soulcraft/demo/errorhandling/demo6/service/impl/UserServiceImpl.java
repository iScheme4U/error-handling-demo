package com.soulcraft.demo.errorhandling.demo6.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soulcraft.demo.errorhandling.demo6.exception.UserResponse;
import com.soulcraft.demo.errorhandling.demo6.resp.page.PageQuery;
import com.soulcraft.demo.errorhandling.demo6.service.UserService;
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

    private static final int MIN_USERNAME_LENGTH = 5;
    private static final int MAX_USERNAME_LENGTH = 16;

    @Override
    public boolean login(String username, String password) {
        UserResponse.USERNAME_CANNOT_BE_EMPTY.assertStringNotEmpty(username);
        int length = username.length();
        boolean usernameValidated = length >= MIN_USERNAME_LENGTH && length <= MAX_USERNAME_LENGTH;
        UserResponse.USERNAME_LENGTH_IS_NOT_VALID.assertTrue(usernameValidated, MIN_USERNAME_LENGTH, MAX_USERNAME_LENGTH);
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
