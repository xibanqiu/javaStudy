package com.atguigu.mybaits.mapper;

import com.atguigu.mybaits.bean.User;

import java.util.List;


public interface UserMapper {

    // 保存用户
    public int saveUser(User user);

    // 更新用户
    public int updateUser(User user);

    // 根据id删除用户
    public int deleteUserById(int id);

    // 根据id搜索用户
    public User findUserById(int id);

    // 搜索全部用户
    public List<User> findUsers();

}
