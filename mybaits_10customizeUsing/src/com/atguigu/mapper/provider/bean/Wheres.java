package com.atguigu.mapper.provider.bean;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Wheres {

	private List<Where> wheres = new ArrayList<>();

	public void add(Where where) {
		wheres.add(where);
	}

	public void add(List<Where> ws) {
		wheres.addAll(ws);
	}

	public List<Where> getWheres() {
		return wheres;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

}
