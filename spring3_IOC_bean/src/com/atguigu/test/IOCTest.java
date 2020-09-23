package com.atguigu.test;

import com.atguigu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

    @Test
    public void test1(){
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(applicationContext.getBean("p1"));

        applicationContext.close();

    }

    @Test
    public void test2() throws Exception {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p1") );
        applicationContext.close();
    }



}
