package com.soulcraft.demo.errorhandling.demo3.resp;

/**
 * <p>
 * 错误返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public class ErrorResponse extends BaseResponse {
    /**
     * 构造错误返回信息
     *
     * @param code    返回码
     * @param message 返回信息
     */
    public ErrorResponse(int code, String message) {
        super(code, message);
    }

    public ErrorResponse(IResponseEnum responseEnum) {
        this(responseEnum, responseEnum.getMessage());
    }

    public ErrorResponse(IResponseEnum responseEnum, String message) {
        this(responseEnum.getCode(), message);
    }
}
