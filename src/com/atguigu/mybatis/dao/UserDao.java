package com.atguigu.mybatis.dao;

import java.util.List;

import com.atguigu.mybatis.bean.User;

public interface UserDao {

	
	//sava user
	public int saveUser(User user);
	
	// update user
	public int updateUser(User user);
	
	//delete user
	public int deleteUserById(int id);
	
	//find user by id
	public User findUserById(int id);
	
	// find all users
	public List<User> findUsers();
	
	
}
