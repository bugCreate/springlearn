package com.learn.cloud.eurelaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: ╮(‵▽′)╭
 * @author: pangtoutuo
 * @create: 2018-07-03
 **/
@Controller
@RequestMapping("/")
public class DemoController {
    @Value("${server.port}")
    int port;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "server at port " + port;
    }
}
