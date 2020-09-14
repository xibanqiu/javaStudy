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
import java.util.ArrayList;
import java.util.List;

public class UserMapperTest {

    static SqlSessionFactory sqlSessionFactory;


    @BeforeClass
    public static void setupBeforeClass() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybaits-config.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }

    @Test
    public void testQueryUserById() throws IOException {
        SqlSession session = sqlSessionFactory.openSession();

        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);

            System.out.println( userMapper.queryUserById(1) );
            System.out.println( userMapper.queryUserById(1) );
            System.out.println( userMapper.queryUserById(1) );
            System.out.println( userMapper.queryUserById(1) );
            System.out.println( userMapper.queryUserById(1) );

        } finally {
            session.close();
        }

    }

    /**
     * 执行失败的四种
     *
     */

    //第一种 失败的情况:  不在一个同一个SqlSession对象中
    @Test
    public void testCacheFail1() throws IOException {
//		1.不在同一个SqlSession对象中
        queryOne();

        queryOne();

    }

    public void queryOne(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.queryUserById(1);

            System.out.println(user);
        }finally {
            sqlSession.close();
        }

    }

    //第二种 失败的情况 执行的,执行的参数不同
    @Test
    public void testCacheFail2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        User user1 = mapper.queryUserById(27);

        System.out.println(user);
        System.out.println(user1);

    }

    //第三种 失败的情况 在两条相同的查询语句中添加了  增、删、改 操作
    @Test
    public  void testCasheFail3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        try {

            System.out.println(mapper.queryUserById(1));
            int hhh = mapper.insertUser(new User(null, "hhh", 0));
            sqlSession.commit();
            System.out.println(mapper.queryUserById(1));
        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void testCasheFail4(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(mapper.queryUserById(1));
            sqlSession.clearCache();
            System.out.println(mapper.queryUserById(1));

        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void testSecondCache() throws IOException {
        queryOne();
        queryOne();
        queryOne();
        queryOne();
    }


}

