package com.atguigu.bean.mapper;

import com.atguigu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<User> queryUsersByNameAndSex(User user);

    public List<User> queryUsersByNameAndSex1(User user);

    public List<User> queryUsersByNameAndSex2(User user);

    public List<User> queryUsersByNameAndSexForChoose(User user);

    public int updateUserForSet(User user);


    public List queryUserByidsForIn(@Param("ids") List ids);
}
