package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.bean.User;
import com.etoak.controller.LoginController;

public class SpringTest {

	public static void main(String[] args) {
		//spring容器
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取spring实例化对象
		LoginController lc = 
				(LoginController)ac.getBean("loginController");
		
		//定义参数
		User user = new User();
		user.setUsername("etoak");
		user.setPassword("et1710");
		
		//调用方法 controller service dao
		String result = lc.login(user);
		
		System.out.println(result);

	}

}
