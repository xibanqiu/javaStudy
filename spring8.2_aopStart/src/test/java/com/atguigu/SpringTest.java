package com.atguigu;

import com.atguigu.calculat.Calculate;
import com.atguigu.calculat.Calculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Calculate calculator = (Calculate) classPathXmlApplicationContext.getBean("calculator");
        System.out.println(calculator.add(1, 3));

    }

}
