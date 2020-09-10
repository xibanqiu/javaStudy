package com.atguigu;

import com.atguigu.bean.Key;
import com.atguigu.mapper.KeyMapper;
import com.atguigu.mapper.LockMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class KeyMapperTest {

     static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void setUpBefore() throws IOException {

        InputStream in = Resources.getResourceAsStream("mybaits-config.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

    }

    @Test
    public void test(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            KeyMapper mapper = sqlSession.getMapper(KeyMapper.class);
            Key key = mapper.queryKeyForSimple(1);

            System.out.println(key);

        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testQueryKeyByTwoStep() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            KeyMapper keyMapper = session.getMapper( KeyMapper.class );
            System.out.println( keyMapper.queryKeyByTwoStep(1) );
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryLockById(){
        SqlSession session = sqlSessionFactory.openSession();
        try {
            LockMapper lockMapper = session.getMapper(LockMapper.class);
            System.out.println( lockMapper.queryLockById(1) );
        } finally {
            session.close();
        }
    }


}
