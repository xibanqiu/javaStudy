package com.atguigu.test;

import com.atguigu.bean.User;
import com.atguigu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;

public class UserMapperTest {

    static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{

        String url = "mybaits-config.xml";
        InputStream in = Resources.getResourceAsStream(url);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void testSaveUser(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(5,"huang",0);
            mapper.saveUser(user);

            sqlSession.commit();
            System.out.println(user);

        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void testUpdateUser() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = new User(5, "eeeee", 1);
            userMapper.updateUser(user);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void testDeleteUserById() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            userMapper.deleteUserById(5);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void testFindUserById() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            System.out.println(userMapper.findUserById(1));
        } finally {
            session.close();
        }
    }

    @Test
    public void testFindUsers() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            System.out.println(userMapper.findUsers());
        } finally {
            session.close();
        }
    }

}


