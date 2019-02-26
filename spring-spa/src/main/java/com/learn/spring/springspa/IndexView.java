package com.learn.spring.springspa;

import org.springframework.stereotype.Service;
import org.springframework.ui.ConcurrentModel;

import java.util.Map;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-02-26
 **/
@Service
public class IndexView {
    public Map<String, Object> getIndexModel(){
        ConcurrentModel model = new ConcurrentModel();
        model.addAttribute("title","spring spa");
        model.addAttribute("word","spring spa");
        return model;
    }
}
