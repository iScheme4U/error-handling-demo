package com.soulcraft.demo.errorhandling.demo6.exception;

import com.soulcraft.demo.errorhandling.demo6.resp.IResponse;
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
    private final IResponse response;
    private final Object[] args;

    public BaseException(IResponse response) {
        this(response, null, response.getMessage());
    }

    public BaseException(IResponse response, Object[] args, String message) {
        this(response, args, message, null);
    }

    public BaseException(IResponse response, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.response = response;
        this.args = args;
    }
}
