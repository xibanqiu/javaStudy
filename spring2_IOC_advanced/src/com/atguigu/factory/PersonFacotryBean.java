package com.atguigu.factory;

import com.atguigu.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class PersonFacotryBean implements FactoryBean<Person> {
	/**
	 * 创建bean对象的方法
	 */
	@Override
	public Person getObject() throws Exception {
		return new Person(17, "这是FactoryBean接口创建的bean", null);
	}
	/**
	 * 获取bean的具体类型的方法
	 */
	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}
	/**
	 * 判断是否是单例的方法
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}

}