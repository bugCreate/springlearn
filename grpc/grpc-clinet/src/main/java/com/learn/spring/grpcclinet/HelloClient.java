package com.learn.spring.grpcclinet;

import com.learn.spring.grpc.HelloServiceGrpc;
import com.learn.spring.grpc.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-15
 **/
@Component
public class HelloClient {
    @Autowired
    private HelloServiceGrpc.HelloServiceFutureStub stub;

    public String hello() throws ExecutionException, InterruptedException {

        return stub.hello(Info.newBuilder().setMsg("hello").build()).get().getMsg();
    }
}
