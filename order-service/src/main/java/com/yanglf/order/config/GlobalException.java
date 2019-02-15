package com.yanglf.order.config;

import com.yanglf.order.exception.NotAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author yanglf
 * @description
 * @since 2019/2/15
 **/
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(NotAccessException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String handleException(NotAccessException ex){
        ex.printStackTrace();
        return "服务不可用";
    }


}
