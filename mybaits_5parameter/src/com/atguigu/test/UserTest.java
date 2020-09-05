package com.atguigu.test;

import com.atguigu.bean.User;
import com.atguigu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {


    static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void setUpBeforeClass() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybaits-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

    }

    @Test
    public void deleteUserById(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            mapper.deleteUserById(25);
            sqlSession.commit();

        }finally {
            sqlSession.close();
        }

    }


    @Test
    public void findUserByNameAndSex(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            List<User> list = mapper.findUserByNameAndSex("knight", 0);

            sqlSession.commit();

            list.forEach(System.out::println);

        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void findUserLikeName1() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            // 需要在传递参数的时候，自己加上前后的两个百分号
            System.out.println( userMapper.findUserLikeName1("%knight%") );
        } finally {
            session.close();
        }
    }

    @Test
    public void findUserLikeName2() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            // 需要在传递参数的时候，自己加上前后的两个百分号
            System.out.println( userMapper.findUserLikeName2("knight") );
        } finally {
            session.close();
        }
    }


}
