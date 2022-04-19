package com.soulcraft.demo.errorhandling.demo3.exception;

import com.soulcraft.demo.errorhandling.demo3.resp.IResponseEnum;
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
    private final IResponseEnum responseEnum;

    /**
     * 构造基础异常对象
     *
     * @param responseEnum 返回信息枚举
     */
    public BusinessException(IResponseEnum responseEnum) {
        this(responseEnum, null);
    }

    /**
     * 构造基础异常对象
     *
     * @param responseEnum 返回信息枚举
     * @param cause        原因
     */
    public BusinessException(IResponseEnum responseEnum, Throwable cause) {
        super(responseEnum.getMessage(), cause);
        this.responseEnum = responseEnum;
    }
}
