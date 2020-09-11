package com.atguigu.mapper;

import com.atguigu.bean.Clazz;

public interface ClazzMapper {

    public Clazz queryClazzByIdForSimple(int id);

    public Clazz queryClazzByIdForLazy(int id);

}
