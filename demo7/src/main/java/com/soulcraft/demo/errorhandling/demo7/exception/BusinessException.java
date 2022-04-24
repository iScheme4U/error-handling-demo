package com.soulcraft.demo.errorhandling.demo7.exception;

import com.soulcraft.demo.errorhandling.demo7.resp.IResponseEnum;
import lombok.Getter;

/**
 * <p>
 * business exception
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@Getter
public class BusinessException extends BaseException {

    public BusinessException(IResponseEnum response, Object[] args, String message) {
        super(response, args, message);
    }

    public BusinessException(IResponseEnum response, Object[] args, String message, Throwable cause) {
        super(response, args, message, cause);
    }
}
