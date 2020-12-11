package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("show1")
    public ModelAndView test1(){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("hello");
        modelAndView.addObject("msg","这是一个SpringMVC 的第一个注解程序 1！！");


        return modelAndView;


    }


}
