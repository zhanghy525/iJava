package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.bean.User;
import com.etoak.factory.UserFactory;

public class SpringTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");

	/*	UserFactory uf = 
				(UserFactory)ac.getBean("&userFactory");
		System.out.println((User)uf.getObject());*/
		
		User user = 
				(User)ac.getBean("userFactory");
		
		System.out.println(user.getName());
		
		for(int i = 1;i <= 10;i++){
			System.out.println((User)ac.getBean("userFactory"));
		}
	}

}
