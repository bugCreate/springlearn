package com.learn.cloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description: ╮(‵▽′)╭
 * @author: pangtoutuo
 * @create: 2018-07-03
 **/

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        System.out.println(name);
        return restTemplate.getForObject("http://hello-server/test",String.class);
    }

}

