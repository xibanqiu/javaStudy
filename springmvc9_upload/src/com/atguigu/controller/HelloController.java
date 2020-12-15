package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("test35")
    public String test35()throws Exception{

        return "redirect:success.html";
    }

    @RequestMapping("show35")
    public String show35( @RequestParam("file") MultipartFile file)throws Exception{

        if(null != file){
            file.transferTo(new File("d:\\"+ file.getOriginalFilename()));
        }

        return "redirect:success.html";
    }

}
