package com.soulcraft.demo.errorhandling.demo5.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.soulcraft.demo.errorhandling.demo5.resp.page.PageQuery;

/**
 * <p>
 * User service
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
public interface UserService {
    boolean login(String username, String password);

    IPage<String> list(PageQuery qo);
}
