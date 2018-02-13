package com.mmnet.crawlerclient.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {


    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e) {
        LOGGER.error("Exception : {}", e.toString());
        LOGGER.error("Exception detail " + req.getRequestURL().toString(), e);
    }
}
