package com.atguigu.bean;

import com.atguigu.mapper.provider.bean.TableName;

@TableName("t_user")
public class User extends BaseEntity{


    public User(Long id) {
        super(id);
    }
}
