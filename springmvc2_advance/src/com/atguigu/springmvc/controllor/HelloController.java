package com.atguigu.springmvc.controllor;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv =new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg","我的第一个程序2");

        return mv;
    }
}
