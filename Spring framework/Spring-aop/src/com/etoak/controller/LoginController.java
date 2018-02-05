package com.etoak.controller;


/**
 * 目标对象
 * 核心
 */
public class LoginController {
	
	/**
	 * 切入点
	 */
	public String login(String username,String password){
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		
		int i = 1/0;
		
		return username + "|" + password;
	}

}
