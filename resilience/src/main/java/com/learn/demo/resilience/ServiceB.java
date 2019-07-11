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
@Retry(name = "backendB")
@CircuitBreaker(name = "backendB")
@RateLimiter(name = "backendB")
@Service
public class ServiceB {
    @Bulkhead(name = "backendB")
    public String sucess(){
        System.out.println("sucess b");
        return "sucess b";
    }
    @Bulkhead(name = "backendB")
    public String fail() throws ResilienceException {
        throw new ResilienceException("fail b");
    }
}
