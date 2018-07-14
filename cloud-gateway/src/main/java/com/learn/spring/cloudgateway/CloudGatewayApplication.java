package com.learn.spring.cloudgateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
/**
 * */
public class CloudGatewayApplication {

        @Value("${baiduurl}")
        String url;


//    @Value("${baiduurl}")
//    String url;

    @Bean
    public RouteLocator baiduRouteLocator(RouteLocatorBuilder builder) {
        String aa =url;
        return builder.routes()
            .route("baidu", r -> r.path("/baidu*")
                .uri(url)
            ).build();
    }

    @Bean
    public RouteLocator hiRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("hi", r -> r.path("/hi*")
                .uri("http://localhost:8764/hi")

            ).build();
    }

    @Bean
    public RouteLocator zhihuRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("zhihu", r -> r.path("/zhihu")
                .uri("https://www.zhihu.com/")

            ).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);

    }
}
