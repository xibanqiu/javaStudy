package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("test32")
    public  String test(){

        return "test_users";
    }

    @RequestMapping("show32")
    public String show32(Model model){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setName("马云" + i);
            user.setUsername("mayun" + i);
            user.setAge(20 + i);
            users.add(user);
        }
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("user")
    public String toUser(Model model){
        model.addAttribute("user", new User());
        return "user";
    }

    @RequestMapping("save.do")
    @ResponseStatus(value= HttpStatus.OK)
    public void save(User user){
        System.out.println(user.toString());
    }



}
