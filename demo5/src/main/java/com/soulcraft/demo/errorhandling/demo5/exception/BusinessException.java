package com.soulcraft.demo.errorhandling.demo5.exception;

import com.soulcraft.demo.errorhandling.demo5.resp.IResponse;
import lombok.Getter;

/**
 * <p>
 * business exception
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@Getter
public class BusinessException extends BaseException {

    /**
     * 构造业务异常对象
     *
     * @param response 返回信息
     */
    public BusinessException(IResponse response) {
        super(response);
    }

    /**
     * 构造业务异常对象
     *
     * @param response 返回信息
     * @param cause    原因
     */
    public BusinessException(IResponse response, Throwable cause) {
        super(response, cause);
    }
}
