package com.etoak.controller;

import org.springframework.stereotype.Controller;

/**
 * 目标对象
 * 核心
 */
@Controller
public class LoginController implements LoginI {
	
	/**
	 * 切入点
	 */
	@Override
	public String login(String username,String password){
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		
		//int i = 1/0;
		
		return username + "|" + password;
	}

}
