package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.controller.LoginController;

public class SpringTest {

	public static void main(String[] args) {
		//spring容器 接在配置 实例化对象 注入   
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取spring管理对象logincontroller
		//LoginController类已经被aop代理  通过aop表达式代理LoginController类
		LoginController login = 
				(LoginController)ac.getBean("login");

		//调用方法    该方法会在执行之前调用aop通知方法 
		String result = login.login("etoak", "et1710");
		
		//输出信息
		System.out.println(result);
	}

}
