package com.soulcraft.demo.errorhandling.demo3.resp;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 基础响应信息类
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
@Getter
@Setter
public abstract class BaseResponse implements IResponse {

    /**
     * 整个错误码信息
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
