package com.atguigu.mapper;

import com.atguigu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public void deleteUserById(int id);

    public List<User> findUserByNameAndSex(String username, int sex);

    public List<User> findUserByNameAndSex2(@Param("username") String username, @Param("sex") int sex);

    public List<User> findUserLikeName1(String name);
    public List<User> findUserLikeName2(String name);

}
