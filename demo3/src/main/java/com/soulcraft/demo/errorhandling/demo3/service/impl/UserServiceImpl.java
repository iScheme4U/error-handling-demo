package com.soulcraft.demo.errorhandling.demo3.service.impl;

import com.soulcraft.demo.errorhandling.demo3.exception.Asserts;
import com.soulcraft.demo.errorhandling.demo3.exception.BusinessException;
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
        Asserts.assertNotEmpty(username, "User name cannot be null or empty");
        Asserts.assertNotEmpty(password, "Password cannot be null or empty");
        if (!"admin".equals(username) || !"123456".equals(password)) {
            throw new BusinessException("User name or password is incorrect");
        }
        return true;
    }
}
