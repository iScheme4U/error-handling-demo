package com.soulcraft.demo.errorhandling.demo2.service.impl;

import com.soulcraft.demo.errorhandling.demo2.exception.BusinessException;
import com.soulcraft.demo.errorhandling.demo2.service.UserService;
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
        if (username == null) {
            throw new BusinessException("User name cannot be null");
        }
        if (password == null) {
            throw new BusinessException("Password cannot be null");
        }
        if (!"admin".equals(username) || !"123456".equals(password)) {
            throw new BusinessException("User name or password is incorrect");
        }
        return true;
    }
}
