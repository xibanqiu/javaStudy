package com.atguigu.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atguigu.mybatis.bean.User;
import com.atguigu.mybatis.dao.UserDao;

public class UserDaoImpl implements UserDao {

	SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public int saveUser(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = 0;
		try {
			result = sqlSession.insert("com.atguigu.mybatis.bean.User.saveUser", user);
			//插入，删除，更新 需要 提交事务
			// 因为设置 提交的 级别为 不自动提交
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return result;
	}

	@Override
	public int updateUser(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = 0;
		try {
			result = sqlSession.update("com.atguigu.mybatis.bean.User.updateUser", user);
			//插入，删除，更新 需要 提交事务
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return result;
	}

	@Override
	public int deleteUserById(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = 0;
		try {
			result = sqlSession.update("com.atguigu.mybatis.bean.User.deleteUserById", id);
			//插入，删除，更新 需要 提交事务
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return result;
	}

	@Override
	public User findUserById(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User result = null;
		try {
			result = sqlSession.selectOne("com.atguigu.mybatis.bean.User.findUserById", id);
		} finally {
			sqlSession.close();
		}
		return result;
	}

	@Override
	public List<User> findUsers() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> result = null;
		try {
			result = sqlSession.selectList("com.atguigu.mybatis.bean.User.findUsers");
		} finally {
			sqlSession.close();
		}
		return result;
	}

}



