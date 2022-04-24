package com.soulcraft.demo.errorhandling.demo7.exception;

import com.soulcraft.demo.errorhandling.demo7.resp.IResponse;
import com.soulcraft.demo.errorhandling.demo7.resp.IResponseEnum;
import lombok.Getter;

/**
 * <p>
 * base exception
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@Getter
public class BaseException extends RuntimeException {
    private final IResponseEnum response;
    private final Object[] args;

    public BaseException(IResponseEnum response) {
        this(response, null, response.getMessage());
    }

    public BaseException(IResponseEnum response, Object[] args, String message) {
        this(response, args, message, null);
    }

    public BaseException(IResponseEnum response, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.response = response;
        this.args = args;
    }
}
