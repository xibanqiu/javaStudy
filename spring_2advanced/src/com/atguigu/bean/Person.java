package com.atguigu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

    private Integer id;
    private String name;
    private Car car;
    private List<Object> list;

    private Map<String, Object> map;

    private Properties props;

    private Set<Object> set;

    public Set<Object> getSet() {
        return set;
    }
    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Map<String, Object> getMap() {
        return map;
    }
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Person() {
    }

    public Person(Integer id, String name, Car car) {
        this.id = id;
        this.name = name;
        this.car = car;
    }


    public Person(Integer id, String name, Car car, List<Object> list) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.list = list;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", list=" + list +
                ", map=" + map +
                ", props=" + props +
                ", set=" + set +
                '}';
    }
}
