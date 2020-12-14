package com.atguigu.pojo;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private String username;

    @JsonIgnore
    private String password;
    private Integer age;
    private double income;
    private Boolean isMarry;

    private String[] interests;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date birthday;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", isMarry=" + isMarry +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public Boolean getMarry() {
        return isMarry;
    }

    public void setMarry(Boolean marry) {
        isMarry = marry;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }
}
