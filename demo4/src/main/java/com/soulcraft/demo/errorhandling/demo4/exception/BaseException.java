package com.soulcraft.demo.errorhandling.demo4.exception;

import com.soulcraft.demo.errorhandling.demo4.resp.IResponse;
import lombok.Getter;

/**
 * <p>
 * base exception
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@Getter
public class BaseException extends RuntimeException {
    private final IResponse response;

    /**
     * 构造基础异常对象
     *
     * @param response 返回信息枚举
     */
    public BaseException(IResponse response) {
        this(response, null);
    }

    /**
     * 构造基础异常对象
     *
     * @param response 返回信息枚举
     * @param cause        原因
     */
    public BaseException(IResponse response, Throwable cause) {
        super(response.getMessage(), cause);
        this.response = response;
    }
}
