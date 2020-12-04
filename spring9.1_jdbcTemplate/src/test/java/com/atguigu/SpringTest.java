package com.atguigu;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringRunner.class)
public class SpringTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test()throws Exception{
        System.out.println(dataSource.getConnection());

    }


}
