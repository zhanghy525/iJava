package com.etoak.test;

import java.util.Date;
import java.util.UUID;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.DigestUtils;

import com.etoak.bean.User;
import com.etoak.dao.UserDao;

public class SpringTest {

	public static void main(String[] args) {
		add();
	}
	
	//新增用户
	public static void add(){
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserDao dao = (UserDao)ac.getBean("userDao");
		
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setUsername("etoak");
		user.setPassword(
				DigestUtils.md5DigestAsHex("123456".getBytes()));
		user.setNickname("易途");
		user.setEmail("etoak@et.com");
		user.setTel("110");
		user.setState(1);
		user.setCreateTime(new Date());
		
		int i = dao.add(user);
		
		System.out.println("插入行数：" + i);
	}
	
	
	
	
	
	
	

}
