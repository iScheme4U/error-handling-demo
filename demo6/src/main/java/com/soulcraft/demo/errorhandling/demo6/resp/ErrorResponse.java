package com.soulcraft.demo.errorhandling.demo6.resp;

/**
 * <p>
 * 错误返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public class ErrorResponse extends BaseResponse {

    public ErrorResponse(int code, String message) {
        super(code, message);
    }

    public ErrorResponse(IResponse response) {
        this(response.getCode(), response.getMessage());
    }

    public ErrorResponse(IResponse response, String message) {
        this(response.getCode(), message);
    }
}
