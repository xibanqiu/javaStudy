package com.atguigu.bean;

public class Person {

    private String name ;
    private  Integer age ;


    public void init(){
        System.out.println("init 方法 创建了");
    }

    public void destroy(){
        System.out.println("destroy 方法 创建了");
    }

    public Person() {
        System.out.println("construction 方法 创建了");
    }

    public Person(String name, Integer age) {
        System.out.println("construction with params 方法 创建了");
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
