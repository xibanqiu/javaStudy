package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("show1")
    public ModelAndView test1(){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg","requestMapping1");

        return mv;

    }

    @RequestMapping("aa?/show2")
    public ModelAndView test2(){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg","ant 风格的映射: ?");

        return mv;

    }

    @RequestMapping("bb*/show3")
    public ModelAndView test3(){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg","ant 风格的映射: *");

        return mv;

    }

    @RequestMapping("**/show4")
    public ModelAndView test4(){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg","ant 风格的映射: *** ");

        return mv;

    }

    /**
     @RequestMapping(value=“/user/{userId}/{name} ")
     请求URL：http://localhost:8080/user/1001/zhangsan.do
     这种方式虽然和通配符“*”类似，却比通配符更加强大，占位符除了可以起到通配的作用，最精要的地方是在于它还可以传递参数。
     比如：通过@PathVariable(“userId”) Long id, @PathVariable(“name”)String name获取对应的参数。
     注意：@PathVariable(“key”)中的key必须和对应的占位符中的参数名一致，而方法形参的参数名可任意取
     */
    @RequestMapping("/show5/{name}/{id}")
    public ModelAndView test5(@PathVariable("name") String name ,@PathVariable("id")Long id){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg", "rest风格的映射：name=" + name + ",id=" + id);

        return mv;

    }

    @RequestMapping(value = "/show6",method = RequestMethod.GET)
    public ModelAndView test6(){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg", "rest风格的映射：6");

        return mv;

    }

    @RequestMapping(value = "/show7",method ={ RequestMethod.GET ,RequestMethod.POST})
    public ModelAndView test7(){
        ModelAndView mv= new ModelAndView();

        mv.setViewName("hello");
        mv.addObject("msg", "rest风格的映射：6");

        return mv;

    }

    @RequestMapping(value = "show8", params = "id")
    public ModelAndView test8() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "springmvc的映射之限定请求参数，id");
        return mv;
    }

    @RequestMapping(value = "show9", params = "!id")
    public ModelAndView test9() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "springmvc的映射之限定请求参数，!id");
        return mv;
    }

    @RequestMapping(value = "show10", params = "id=1")
    public ModelAndView test10() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "springmvc的映射之限定请求参数，id=1");
        return mv;
    }

    @RequestMapping(value = "show11", params = "id!=1")
    public ModelAndView test11() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "springmvc的映射之限定请求参数，id!=1");
        return mv;
    }

    @RequestMapping(value = "show12", params = { "id", "name" })
    public ModelAndView test12() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "springmvc的映射之限定请求参数，id,name");
        return mv;
    }



    /**
     * 1.请求头信息必须包含User-Agent
     * 2.User-Agent头参数的值必须为Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36
     *   即：限定浏览器必须是谷歌浏览器，而且版本还是Chrome/69.0.3497.100
     * @return
     */
    @RequestMapping(value = "show13", headers = "User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36")
    public ModelAndView test13() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "限定请求头信息");
        return mv;
    }

//    GetMapping：相当于RequestMapping（method = RequestMethod.GET）
//    PostMapping：相当于RequestMapping（method = RequestMethod.POST）
//    PutMapping：相当于RequestMapping（method = RequestMethod.PUT）
//    DeleteMapping：相当于RequestMapping（method = RequestMethod.DELETE）
    @GetMapping(value = "show14")
    public ModelAndView test14() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "GetMapping");
        return mv;
    }

    @PostMapping(value = "show15")
    public ModelAndView test15() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "PostMapping");
        return mv;
    }

    @PutMapping(value = "show16")
    public ModelAndView test16() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "PutMapping");
        return mv;
    }

    @DeleteMapping(value = "show17")
    public ModelAndView test17() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "DeleteMapping");
        return mv;
    }


}
