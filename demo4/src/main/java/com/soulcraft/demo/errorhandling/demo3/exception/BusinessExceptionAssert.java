package com.soulcraft.demo.errorhandling.demo3.exception;

import com.soulcraft.demo.errorhandling.demo3.resp.IResponse;

/**
 * <p>
 * 业务错误信息断言
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public interface BusinessExceptionAssert extends IResponse, Assert {

    @Override
    default BusinessException newException() {
        return new BusinessException(this);
    }

    @Override
    default BusinessException newException(Throwable cause) {
        return new BusinessException(this, cause);
    }

}
