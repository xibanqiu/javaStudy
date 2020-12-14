package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("show29")
    public String show29(){

        return "forward:show31.do?id=111&key=forward";

    }


    @RequestMapping("show30")
    public String show30(){

        return "redirect:show31.do?id=111&key=redirect";
    }


    @RequestMapping("show31")
    public String show31(Model model, @RequestParam("id")Long id , @RequestParam("key")String key){

        model.addAttribute("msg", "forward?redirect: id=" + id + ", key=" + key);

        return "hello";
    }



}
