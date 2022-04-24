package com.soulcraft.demo.errorhandling.demo6.resp;

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
     * 错误码
     */
    private int code;
    /**
     * 错误信息
     */
    private String message;

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
