package com.soulcraft.demo.errorhandling.demo7.resp;

import com.soulcraft.demo.errorhandling.demo7.util.MessageUtils;

/**
 * <p>
 * 错误返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public class ErrorResponse extends BaseResponse {

    public ErrorResponse(String appName, String moduleName, int code, String message) {
        super(appName, moduleName, code, message);
    }

    public ErrorResponse(IResponseEnum responseEnum, String message) {
        this(responseEnum.getAppName(), responseEnum.getModuleName(), responseEnum.getCode(), message);
    }

    public ErrorResponse(IResponseEnum responseEnum) {
        this(responseEnum, MessageUtils.getResponseMessage(responseEnum.toString()));
    }
}
