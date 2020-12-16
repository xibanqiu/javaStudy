package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {


    /**
     *
     第三种、使用@HandlerException注解
     */
//    @ExceptionHandler(ArithmeticException.class) // 可加参数
//    public ModelAndView handleException(Exception e){
//
//        ModelAndView mv= new ModelAndView();
//        mv.addObject("msg",e.getMessage());
//        mv.setViewName("hello");
//
//        return mv;
//
//    }



    @RequestMapping("/show1")
    public ModelAndView show1(){

         int i =1/0;

        ModelAndView mv= new ModelAndView();
        mv.addObject("msg","hello");
        mv.setViewName("hello");

        return mv;

    }





}
