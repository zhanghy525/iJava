package com.etoak.dao;

import com.etoak.bean.User;

public interface UserDao {

	// 登录
	public User login(String username, String password);

}
