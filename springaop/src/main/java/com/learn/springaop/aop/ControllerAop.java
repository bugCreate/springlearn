package com.learn.springaop.aop;

import com.learn.springaop.exception.AdviceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-12
 **/
@ControllerAdvice
public class ControllerAop {
    
    @ExceptionHandler(AdviceException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public String handleException(AdviceException e) {
        return e.getMessage();
    }
}
