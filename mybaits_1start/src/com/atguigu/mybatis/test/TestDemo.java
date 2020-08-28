package com.atguigu.mybatis.test;

import com.atguigu.mybatis.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestDemo {

    @Test
    public void test1() throws IOException {
        // 读取mybatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybaits-config.xml");
        // 通过SqlSessionFactoryBuilder创建一个SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 创建一个sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            //第一个参数是你要执行的sql 语句（名称空间+id）
            //第二个参数 是你要执行sql 的对应参数
            User user = sqlSession.selectOne("com.atguigu.mybatis.bean.User.selectUserById", 1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }

}
