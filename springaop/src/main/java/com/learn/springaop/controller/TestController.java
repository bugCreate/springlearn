package com.learn.springaop.controller;

import com.learn.springaop.exception.AdviceException;
import com.learn.springaop.exception.CallNotPermittedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-12
 **/
@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String test() throws AdviceException {
        throw new AdviceException("test controller advice");
    }
    @GetMapping("test")
    public String test1() throws CallNotPermittedException {
        throw new CallNotPermittedException("test controller exception");
    }
}
