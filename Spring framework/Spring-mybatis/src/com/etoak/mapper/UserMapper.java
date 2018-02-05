package com.etoak.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etoak.bean.User;

public interface UserMapper {
	
	public int add(User user);
	
	/**
	 * 什么情况下使用@Param注解
	 * 定义方法参数是一个参数的时候
	 * 基本数据类型 包装类型 String
	 * */
	public List<User> selectPage(
			@Param("username") String username);

}
