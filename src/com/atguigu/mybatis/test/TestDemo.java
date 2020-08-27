package com.atguigu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.mybatis.bean.User;

public class TestDemo {

	
	@Test
	public void test1() throws Exception {
		
		InputStream is = Resources.getResourceAsStream("mybaits-config.xml");
		
		
		SqlSessionFactory sqlSesionFactory = new SqlSessionFactoryBuilder().build(is);
		
		
		SqlSession session = sqlSesionFactory.openSession();
		
		try {
			User user = session.selectOne("com.atguigu.mybatis.bean.User.selectUserById", 1);
			System.out.println(user);
			
		}finally {
			session.close();
		}
		
		
	}
}
