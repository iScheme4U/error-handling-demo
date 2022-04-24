package com.soulcraft.demo.errorhandling.demo6.exception;

import com.soulcraft.demo.errorhandling.demo6.resp.IResponse;
import com.soulcraft.demo.errorhandling.demo6.util.MessageUtils;

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
    default BusinessException newException(Object... args) {
        // 获取国际化消息
        String msg = MessageUtils.getResponseMessage(this.toString(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BusinessException newException(Throwable cause, Object... args) {
        // 获取国际化消息
        String msg = MessageUtils.getResponseMessage(this.toString(), args);
        return new BusinessException(this, args, msg, cause);
    }

}
