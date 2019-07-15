package com.learn.spring.grpcclinet.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-15
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "grpc.client")
public class GrpcConfig {
    String host;
    int port;
}
