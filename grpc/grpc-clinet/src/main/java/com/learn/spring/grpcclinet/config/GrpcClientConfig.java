package com.learn.spring.grpcclinet.config;

import com.learn.spring.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-15
 **/
@Configuration
public class GrpcClientConfig {
    @Autowired
    private GrpcConfig grpcConfig;

    @Bean
    public HelloServiceGrpc.HelloServiceFutureStub init() {
        final ManagedChannel channel = ManagedChannelBuilder.forAddress(grpcConfig.getHost(), grpcConfig.getPort())
            .usePlaintext()
            .build();
        HelloServiceGrpc.HelloServiceFutureStub stub = HelloServiceGrpc.newFutureStub(channel);
        return stub;
    }
}
