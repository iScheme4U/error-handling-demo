package com.soulcraft.demo.errorhandling.demo4.resp;

/**
 * <p>
 * 返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public interface IResponse {

    /**
     * 返回码
     *
     * @return 返回码
     */
    int getCode();

    /**
     * 返回消息
     *
     * @return 返回消息
     */
    String getMessage();
}
