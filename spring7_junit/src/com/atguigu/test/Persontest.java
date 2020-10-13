package com.atguigu.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Persontest {

    @Test
    public void test1() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        System.out.println(applicationContext.getBean("bookDao"));
//        System.out.println(applicationContext.getBean("bookDao"));
//        System.out.println(applicationContext.getBean("bookDao"));
//        System.out.println(applicationContext.getBean("book"));
        System.out.println(applicationContext.getBean("bookService"));
//        System.out.println(applicationContext.getBean("bookController"));

    }

}
