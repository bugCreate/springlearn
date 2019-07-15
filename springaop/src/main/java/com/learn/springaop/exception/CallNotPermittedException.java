package com.learn.springaop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-15
 **/
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class CallNotPermittedException extends Exception {
    public CallNotPermittedException(String msg) {
        super(msg);
    }

    public CallNotPermittedException(Throwable e) {
        super(e);
    }
}
