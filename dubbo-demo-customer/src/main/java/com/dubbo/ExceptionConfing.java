package com.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 2019/1/18 10:14
 * 走路呼呼带风
 */
@ControllerAdvice
@Slf4j
public class ExceptionConfing {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exception(Exception e){
        log.error(e.getMessage(),e);
        return e.getMessage();
    }
}
