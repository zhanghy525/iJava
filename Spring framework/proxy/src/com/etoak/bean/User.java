package com.etoak.bean;

public class User implements IUser {

	@Override
	public String add(String id, String name) {
		System.out.println("ID：" + id);
		System.out.println("名称：" + name);
		return id + "|" + name;
	}

	@Override
	public void del() {
		System.out.println("执行删除操作！！");
	}

}
