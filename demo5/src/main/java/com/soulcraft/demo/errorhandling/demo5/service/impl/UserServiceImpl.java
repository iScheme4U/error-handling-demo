package com.soulcraft.demo.errorhandling.demo5.service.impl;

import com.soulcraft.demo.errorhandling.demo5.exception.UserResponse;
import com.soulcraft.demo.errorhandling.demo5.service.UserService;
import org.springframework.stereotype.Service;

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
}
