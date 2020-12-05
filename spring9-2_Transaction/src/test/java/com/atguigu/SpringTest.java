package com.atguigu;


import com.atguigu.service.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//@ContextConfiguration(locations = "classpath:applicationContext.xml")
//@RunWith(SpringRunner.class)
public class SpringTest {




    @Test
    public void test1() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransactionService transactionService = (TransactionService) applicationContext.getBean("transactionService");
        transactionService.multiUpdate();
    }


}
