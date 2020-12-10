package com.atguigu.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        System.out.println(111);
        ModelAndView mv = new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg","第一个spring 程序");

        return mv;
    }
}
