package com.atguigu.controller;


import com.atguigu.pojo.User;
import com.atguigu.pojo.UserVo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("show18")
    public ModelAndView test18(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");

        StringBuffer sb = new StringBuffer();
        sb.append("request: " + request.toString() + "<br />");
        sb.append("response: " + response.toString() + "<br />");
        sb.append("session: " + session.toString() + "<br />");

        mv.addObject("msg", sb.toString());
        return mv;
    }

    @GetMapping("show19")
    public String test19(Model model, ModelMap modelMap, Map<String,Object> map){

//        model.addAttribute("msg","Model 数据模型");
//        modelMap.addAttribute("msg","modelMap 数据模型");

        map.put("msg","map数据模型");
        return "hello";
    }


    @RequestMapping("show20/{name}")
    public String test20(@PathVariable("name") String name, Model model){
        model.addAttribute("msg", "获取占位符参数：" + name);
        return "hello";
    }

//    @RequestParam(value=””, required=true/false, defaultValue=””)
//1.value：参数名
//2.required：是否必须，默认为true，标示请求参数中必须包含该参数，如果不包含则抛出异常
//3.defaultValue：默认参数值，如果设置了该值，required=true将失效，自动为false，如果请求中不包含该参数则使用默认值。
    @RequestMapping("show21")
    public String test21(@RequestParam("name")String name, Model model){
        model.addAttribute("msg", "获取普通参数：" + name);
        return "hello";
    }

    @RequestMapping("show22")
    public String test22(@RequestParam(value = "name", required = false)String name, Model model){
        model.addAttribute("msg", "获取普通参数：" + name);
        return "hello";
    }

    @RequestMapping("show23")
    public String test23(@RequestParam(value = "name", defaultValue = "lisi")String name, Model model){
        model.addAttribute("msg", "获取普通参数：" + name);
        return "hello";
    }



    @RequestMapping("show24")
    public String test24(@RequestHeader("User-Agent") String userAgent,Model model){

        model.addAttribute("msg", "获取请求头信息参数：" + userAgent);
        return "hello";

    }

    @RequestMapping("show25")
    public String test25(@CookieValue("JSESSIONID") String sessionId ,Model model){

        model.addAttribute("msg", "获取cookie中的参数：" + sessionId);
        return "hello";
    }

    /**
     * 方法的返回值为void 是。处理完业务逻辑后，可以通过@ResponseStatus 注解设置响应状态码
     *
     * 告诉浏览器已经处理成功
     * @param name
     * @param age
     * @param isMarry
     * @param income
     * @param interests
     */
    @RequestMapping("show26")
    @ResponseStatus(HttpStatus.OK)
    public void test26(@RequestParam("name") String name, @RequestParam("age") Integer age,
                       @RequestParam("isMarry") Boolean isMarry, @RequestParam("income") Double income,
                       @RequestParam("interests") String[] interests){

        StringBuffer sb = new StringBuffer();
        sb.append("name: " + name + "\n");
        sb.append("age: " + age + "\n");
        sb.append("isMarry: " + isMarry + "\n");
        sb.append("income: " + income + "\n");
        sb.append("interests: [");
        for (String interest : interests) {
            sb.append(interest + " ");
        }
        sb.append("]");
        System.out.println(sb.toString());


    }

    @RequestMapping("show27")
    public String test27(@RequestParam("name") String name, User user, Model model) {

        model.addAttribute("msg", user.toString() + "<br />" + name);
        return "hello";
    }


    @RequestMapping("show28")
    public String test28(Model model, UserVo vo) {
        model.addAttribute("msg", vo);
        return "hello";
    }





}
