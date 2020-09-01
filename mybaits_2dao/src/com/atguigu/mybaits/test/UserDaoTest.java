package com.atguigu.mybaits.test;


import com.atguigu.mybaits.bean.User;
import com.atguigu.mybaits.dao.UserDao;
import com.atguigu.mybaits.dao.daoimpl.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UserDaoTest {

    static UserDao userDao;

    @BeforeClass
    public static void setBeforeClass() throws Exception {

        String url = "mybaits-config.xml";

        InputStream in = Resources.getResourceAsStream(url);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        userDao = new UserDaoImpl(sqlSessionFactory);
    }

    @Test
    public void testInsertUser(){

        User user = new User(5, "ccc", 0);
        int ccc = userDao.insertUser(user);

    }

    @Test
    public void testDeleteUserById(){

        int ccc = userDao.deleteUserById(21);

    }

    @Test
    public void testUpdateUser(){

        User user = new User(20, "2020", 0);
        int ccc = userDao.updateUser(user);

    }

    @Test
    public void testFindUserById(){

        User userById = userDao.findUserById(20);
        System.out.println(userById);
    }


    @Test
    public void testFindUsers(){

        userDao.findUsers().forEach(System.out::println);

    }

    @Test
    public void testInsertUser1(){

        User user = new User(5, "hha", 0);
        int ccc = userDao.insertUser1(user);
        System.out.println(user.getId());

    }

    @Test
    public void testInsertUser2(){

        User user = new User(5, "ooo", 0);
        int ccc = userDao.insertUser2(user);
        System.out.println(user.getId());

    }


}
