package com.soulcraft.demo.errorhandling.demo7.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * 用户操作相关返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-04-19
 */
@Getter
@AllArgsConstructor
public enum CommonResponse implements BusinessExceptionAssert {

    SUCCESS(200, "Success"),
    ;

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

    public String getAppName() {
        return "COM";
    }

    public String getModuleName() {
        return "SRV";
    }
}
