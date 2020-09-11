package com.atguigu.test;

import com.atguigu.bean.Clazz;
import com.atguigu.mapper.ClazzMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ClazzTest {


    static SqlSessionFactory sqlSessionFactory;


    @BeforeClass
    public static void setupBefore() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybaits-config.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }


    @Test
    public void testQueryClazzByIdForSimple() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            ClazzMapper clazzMapper = session.getMapper( ClazzMapper.class );
            System.out.println( clazzMapper.queryClazzByIdForSimple(1) );
        } finally {
            session.close();
        }
    }


    @Test
    public void testQueryClazzByIdForLazy() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            ClazzMapper clazzMapper = session.getMapper( ClazzMapper.class );
            Clazz clazz = clazzMapper.queryClazzByIdForLazy( 1 );
            System.out.println(clazz.getName());
            try {
                //暂停一会儿
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(clazz.getStus());
        } finally {
            session.close();
        }
    }

}
