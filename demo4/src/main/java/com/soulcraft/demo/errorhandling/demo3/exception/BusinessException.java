package com.soulcraft.demo.errorhandling.demo3.exception;

import com.soulcraft.demo.errorhandling.demo3.resp.IResponse;
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
public class BusinessException extends RuntimeException {
    private final IResponse responseEnum;

    /**
     * 构造基础异常对象
     *
     * @param responseEnum 返回信息枚举
     */
    public BusinessException(IResponse responseEnum) {
        this(responseEnum, null);
    }

    /**
     * 构造基础异常对象
     *
     * @param responseEnum 返回信息枚举
     * @param cause        原因
     */
    public BusinessException(IResponse responseEnum, Throwable cause) {
        super(responseEnum.getMessage(), cause);
        this.responseEnum = responseEnum;
    }
}
