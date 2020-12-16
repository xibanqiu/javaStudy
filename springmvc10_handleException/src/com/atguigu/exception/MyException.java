package com.atguigu.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//  第一种、实现HandlerExceptionResolver接口
//@Component
public class MyException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView mv = new ModelAndView();

        if(e instanceof ArithmeticException){
            mv.setViewName("hello");
            mv.addObject("msg","算术异常"+e.getMessage());
        }else {
            mv.setViewName("hello");
            mv.addObject("msg","异常"+e.getMessage());
        }

        return mv;
    }
}
