package com.atguigu.mapper;

import com.atguigu.bean.Key;

public interface KeyMapper {

    public Key queryKeyForSimple(int id);

    public Key queryKeyByTwoStep(int id);
}
