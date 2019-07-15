package com.learn.spring.grpcclinet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-15
 **/
@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private HelloClient client;
    @GetMapping
    public String helloGrpc() throws ExecutionException, InterruptedException {
        return client.hello();
    }
}
