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
    public void testQueryUsersByNameAndSex() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);

            List<User> users = userMapper.queryUsersByNameAndSex(new User(0, "c", 1));

            System.out.println(users);

        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryUsersByNameAndSex1() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);

            List<User> users = userMapper.queryUsersByNameAndSex1(new User(0, "c", 0));

            System.out.println(users);

        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryUsersByNameAndSex2() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);

            List<User> users = userMapper.queryUsersByNameAndSex2(new User(-1, "c", 0));

            System.out.println(users);

        } finally {
            session.close();
        }
    }
    @Test
    public void testQueryUsersByNameAndSexForChoose() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> users = userMapper.queryUsersByNameAndSexForChoose(new User(-1,"admin", 0));
            System.out.println(users);
        } finally {
            session.close();
        }
    }




    @Test
    public void testUpdateUserForSet() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            userMapper.updateUserForSet(new User(27, "xxxx", 10));
            session.commit();
        } finally {
            session.close();
        }
    }


    @Test
    public void testQueryUserByidsForIn() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<Integer> ids = new ArrayList<>();
            ids.add(1);
            ids.add(26);
            ids.add(27);

            List<User> users = userMapper.queryUserByidsForIn( ids );
            System.out.println(users);
        } finally {
            session.close();
        }
    }



}
