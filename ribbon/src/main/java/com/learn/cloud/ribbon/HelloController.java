package com.learn.cloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: ╮(‵▽′)╭
 * @author: pangtoutuo
 * @create: 2018-07-03
 **/

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "hi")
    @ResponseBody
    public String hi(@RequestParam String name) {

        return "send message to " + helloService.hiService(name);
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public String test() {

        return "ok";
    }
}
