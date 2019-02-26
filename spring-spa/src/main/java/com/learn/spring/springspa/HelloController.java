package com.learn.spring.springspa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-02-26
 **/
@Controller
public class HelloController {
    @Autowired
    private IndexView indexView;

    @GetMapping("/")
    public String getSyncDuirdReport(Model model) {
        model.addAllAttributes(indexView.getIndexModel());
        return "index";
    }
}
