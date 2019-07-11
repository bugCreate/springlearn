package com.learn.demo.resilience;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-10
 **/
@Retry(name = "backendA")
@CircuitBreaker(name = "backendA")
@RateLimiter(name = "backendA")
@Service
public class ServiceA {
    @Bulkhead(name = "backendA")
    public String sucess(){
        System.out.println("sucess a");
        return "sucess a";
    }
    @Bulkhead(name = "backendA")
    public String fail() throws ResilienceException {
        System.out.println("fail a");
        throw new ResilienceException("fail a");
    }
}
