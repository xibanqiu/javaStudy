package com.atguigu.bean.test;

import com.atguigu.bean.User;
import com.atguigu.bean.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserMapperTest {

    static SqlSessionFactory sqlSessionFactory;


    @BeforeClass
    public static void setupBeforeClass() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybaits-config.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }




}
