package com.atguigu.processor;

import com.atguigu.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {

        System.out.println("初始化方法之后。正在初始化的对象bean->" + bean + ",正在初始化对象的id值->" + id);

        if("p1".equals(id)){
            Person person = (Person) bean;
            person.setName("这是我给的值");

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
        System.out.println("初始化方法之前。正在初始化的对象bean->" + bean + ",正在初始化对象的id值->" + id);
        return bean;
    }
}
