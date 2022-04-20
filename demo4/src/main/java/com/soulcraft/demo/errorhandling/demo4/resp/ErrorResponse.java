package com.soulcraft.demo.errorhandling.demo4.resp;

/**
 * <p>
 * 错误返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public class ErrorResponse extends BaseResponse {

    public ErrorResponse(IResponse response) {
        super(response.getCode(), response.getMessage());
    }
}
