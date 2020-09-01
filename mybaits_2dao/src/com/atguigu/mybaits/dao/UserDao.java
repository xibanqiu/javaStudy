package com.atguigu.mybaits.dao;

import com.atguigu.mybaits.bean.User;

import java.util.List;

public interface UserDao {

    public int insertUser(User user);

    public int deleteUserById(Integer id);

    public int updateUser(User user);

    public User findUserById(Integer id);

    public List<User> findUsers();

    public int insertUser1(User user);

    public int insertUser2(User user);



}
