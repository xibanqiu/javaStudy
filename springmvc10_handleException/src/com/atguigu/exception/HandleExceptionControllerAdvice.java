package com.atguigu.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class HandleExceptionControllerAdvice  {

    @ExceptionHandler
    public ModelAndView handleException(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "出异常了-全局");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView handleException2(ArithmeticException ex){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "算术 11" + ex.getMessage());
        return mv;
    }

}
