package com.atguigu.mapper;

import com.atguigu.bean.Student;

import java.util.List;

public interface StudentMapper {

	public List<Student> queryStudentsByClazzId(int clazzId);

}