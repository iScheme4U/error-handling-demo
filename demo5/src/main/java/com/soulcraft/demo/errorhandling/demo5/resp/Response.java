package com.soulcraft.demo.errorhandling.demo5.resp;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 通用返回对象
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
@Getter
@Setter
public class Response<T> extends BaseResponse {
    private T data;

    protected Response(IResponse response, T data) {
        this(response.getCode(), response.getMessage(), data);
    }

    protected Response(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    /**
     * 成功返回结果
     */
    public static <T> Response<T> success() {
        return success(null);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> Response<T> success(T data) {
        return new Response<>(200, "SUCCESS", data);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     */
    public static <T> Response<T> failed(IResponse errorCode) {
        return failed(errorCode, null);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     * @param data      数据对象
     */
    public static <T> Response<T> failed(IResponse errorCode, T data) {
        return new Response<>(errorCode, data);
    }
}
