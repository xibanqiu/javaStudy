package com.atguigu.mapper;

import com.atguigu.bean.User;

public interface UserMapper {

    public User queryUserById(Integer id);

    public int insertUser(User user);
}
