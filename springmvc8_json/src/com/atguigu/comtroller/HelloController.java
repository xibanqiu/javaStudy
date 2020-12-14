package com.atguigu.comtroller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    /**
     * 需要把什么转化为json，就返回什么数据
     * 1.当方法上有@ResponseBody注解，代表方法的返回值需要输出其他视图
     * 2.把方法的返回值转化为其他视图（json）
     * @param model
     * @return
     */
    @RequestMapping("show33")
    @ResponseBody
    public List<User> test33(Model model){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setName("马云" + i);
            user.setUsername("mayun" + i);
            user.setAge(20 + i);
            users.add(user);
        }
        return users;
    }


    @RequestMapping("show34")
    public String test34(@RequestBody User user, Model model){
        model.addAttribute("msg", user.toString());
        return "hello";
    }



}
