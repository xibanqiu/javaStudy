package com.atguigu.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Persontest {

    @Test
    public void test8(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p8") );
    }

    @Test
    public void test9(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p9") );
    }

    @Test
    public void test10(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p10") );
    }

    @Test
    public void test11(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p11") );
    }

    @Test
    public void test12(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p12") );
    }

    @Test
    public void test13(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("pset") );
    }


    @Test
    public void test14() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p14") );
        System.out.println( applicationContext.getBean("list01") );

    }

    @Test
    public void test15() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("p15") );
        System.out.println( applicationContext.getBean("car1") );
    }

    @Test
    public void test16() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p16") );
    }

    @Test
    public void test17() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p17") );

    }

    @Test
    public void test18() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p18") );

    }

    @Test
    public void test19() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("parent") );
        System.out.println( applicationContext.getBean("p19") );
    }

    @Test
    public void test20() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p20") );
        System.out.println( applicationContext.getBean("parent2") );  //报错 Bean definition is abstract ,抽象类不能实例化

    }

    @Test
    public void test21(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }




}
