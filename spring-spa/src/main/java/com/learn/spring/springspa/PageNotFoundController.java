package com.learn.spring.springspa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-02-26
 **/
@Controller
public class PageNotFoundController extends BasicErrorController {
    @Value("${spring.web.indexview.path}")
    private String indexViewPath;
    @Autowired
    private IndexView indexView;

    public PageNotFoundController
        (ErrorAttributes errorAttributes, ServerProperties serverProperties) {
        super(errorAttributes, serverProperties.getError());
    }

    @Override
    public ModelAndView errorHtml(
        final HttpServletRequest request, final HttpServletResponse response
    ) {
        HttpStatus status = getStatus(request);
        if (HttpStatus.NOT_FOUND.equals(status)) {
            return new ModelAndView(indexViewPath, indexView.getIndexModel());
        }
        return super.errorHtml(request, response);
    }
}
