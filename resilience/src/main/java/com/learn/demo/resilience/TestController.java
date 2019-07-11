package com.learn.demo.resilience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-07-10
 **/
@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private ServiceA serviceA;
    @Autowired
    private ServiceB serviceB;

    @GetMapping("serviceA/sucess")
    public String serviceASucess()
    {
         return serviceA.sucess();
    }
    @GetMapping("serviceA/failed")
    public String serviceAFailed() throws ResilienceException {
        return serviceA.fail();
    }

    @GetMapping("serviceB/sucess")
    public String serviceBSucess()
    {
        return serviceB.sucess();
    }
    @GetMapping("serviceB/failed")
    public String serviceBFailed() throws ResilienceException {
        return serviceB.fail();
    }
}
