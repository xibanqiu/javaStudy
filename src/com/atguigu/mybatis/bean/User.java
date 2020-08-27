package com.atguigu.mybatis.bean;

public class User {

	private int id;
	private String lastName;
	private int sex;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", lastName=" + lastName + ", sex=" + sex + "]";
	}
	
	
}
