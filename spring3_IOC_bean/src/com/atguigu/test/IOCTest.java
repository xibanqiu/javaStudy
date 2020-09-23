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
        //  如果 <bean > 中id 没有赋值的话，默认的id名为 com.atguigu.bean.Person#0

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("com.atguigu.bean.Person#0") );
        applicationContext.close();
    }



}
