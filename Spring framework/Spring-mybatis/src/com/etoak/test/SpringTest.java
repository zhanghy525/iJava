package com.etoak.test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etoak.bean.User;
import com.etoak.service.UserService;

//spring整合junit
@RunWith(SpringJUnit4ClassRunner.class)
//spring启动容器
@ContextConfiguration(
		locations={"classpath:applicationContext.xml"})
public class SpringTest {
	
	@Autowired
	private UserService service;
	
	@Test
	public void add(){
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setUsername("易途");
		user.setPassword("123456");
		user.setNickname("易途");
		user.setEmail("etoak@qq.com");
		user.setTel("110");
		user.setState(1);
		user.setCreateTime(new Date());
		
		int i = service.add(user);
		
		System.out.println("插入行数：" + i);
	}
	
	@Test
	public void selectPage(){
		String username = "etoak";
		Integer page = 1;
		Integer rows = 3;
		List<User> list = 
				service.selectPage(username, page, rows);
		
		for(User user : list){
			System.out.println("ID:" + user.getId());
			System.out.println("用户名:" + user.getUsername());
			System.out.println("=======================");
		} 
	}
	
	
	
	

}
