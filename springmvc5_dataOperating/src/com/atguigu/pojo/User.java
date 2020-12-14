package com.atguigu.pojo;

import java.util.Arrays;

public class User {

    private String name;
    private Integer age;
    private double income;
    private boolean isMarry;
    private String[] interests;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", isMarry=" + isMarry +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isMarry() {
        return isMarry;
    }

    public void setMarry(boolean marry) {
        isMarry = marry;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }
}
