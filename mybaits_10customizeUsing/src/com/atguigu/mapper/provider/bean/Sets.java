package com.atguigu.mapper.provider.bean;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Sets {

	private List<Set> sets = new ArrayList<>();

	public void add(Set set) {
		sets.add(set);
	}

	public void add(List<Set> sets) {
		sets.addAll(sets);
	}

	public List<Set> getSets() {
		return sets;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

}
