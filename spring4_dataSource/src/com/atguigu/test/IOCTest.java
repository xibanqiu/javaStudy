package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class IOCTest {

    @Test
    public void test1() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");

        System.out.println( dataSource.getConnection() );

    }



}
