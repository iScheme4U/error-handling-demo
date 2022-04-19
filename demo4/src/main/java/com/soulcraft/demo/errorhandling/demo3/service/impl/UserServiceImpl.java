package com.soulcraft.demo.errorhandling.demo3.service.impl;

import com.soulcraft.demo.errorhandling.demo3.exception.UserEnums;
import com.soulcraft.demo.errorhandling.demo3.service.UserService;
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
        UserEnums.USERNAME_CANNOT_BE_EMPTY.assertStringNotEmpty(username);
        UserEnums.PASSWORD_CANNOT_BE_EMPTY.assertStringNotEmpty(password);
        if (!"admin".equals(username) || !"123456".equals(password)) {
            UserEnums.USER_LOGIN_FAILED.throwNewException();
        }
        return true;
    }
}
