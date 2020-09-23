package com.atguigu.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Persontest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p1") );
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p2") );
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p3") );
    }

    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p4") );
    }

    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p5") );
    }

    @Test
    public void test6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p6") );
    }

}
