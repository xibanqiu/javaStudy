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

public class UserMapperTest {


    static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void setupBeforeClass() throws IOException {

        InputStream in = Resources.getResourceAsStream("mybaits-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

    }


    @Test
    public void test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

      try {
          UserMapper mapper = sqlSession.getMapper(UserMapper.class);

          int i = mapper.deleteById(1, User.class);
          sqlSession.commit();
      }finally {
          sqlSession.close();
      }



    }

}




