package com.etoak.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.bean.Student;

public class SpringTest {
	
	@Test
	public void singleton(){
		//创建spring容器 实例化对象  注入
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		for(int i = 1; i <= 10;i++){
			Student stu = (Student)ac.getBean("stuSingleton");
			System.out.println(i + ":" + stu);
		}
		
	}

	
	@Test
	public void prototype(){
		//创建spring容器 实例化对象  注入
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		for(int i = 1; i <= 10;i++){
			Student stu = (Student)ac.getBean("stuPrototype");
			System.out.println(i + ":" + stu);
		}
		
	}
	

}
