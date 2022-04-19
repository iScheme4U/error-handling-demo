package com.soulcraft.demo.errorhandling.demo3.handler;

import com.soulcraft.demo.errorhandling.demo3.exception.BusinessException;
import com.soulcraft.demo.errorhandling.demo3.resp.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * Unified Exception Handler
 * </p>
 *
 * @author Scott
 * @since 20220419
 */
@Slf4j
@ControllerAdvice
public class UnifiedExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ErrorResponse handleBusinessException(BusinessException e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(e.getResponseEnum());
    }
}
