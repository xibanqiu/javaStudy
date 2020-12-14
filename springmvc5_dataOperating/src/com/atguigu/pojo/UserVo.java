package com.atguigu.pojo;

import java.util.List;

public class UserVo {
    private List<User> users;


    @Override
    public String toString() {
        return "UserVo{" +
                "users=" + users +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
