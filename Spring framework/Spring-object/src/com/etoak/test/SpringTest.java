package com.etoak.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.bean.ObjectBean;
import com.etoak.bean.Student;

public class SpringTest {
	
	//定义spring容器对象ApplicationContext
	private ApplicationContext ac;
	//定义javabean对象ObjectBean
	private ObjectBean ob;
	
	@Before
	public void before(){
		//创建spring容器
		ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过spring容器管理javabean  获取实例对象
		ob = ac.getBean(ObjectBean.class);
	}
	
	//注入集合list
	@Test
	public void lists(){
		List<String> list = ob.getLists();
		System.out.println(list);
	}
	
	//注入集合set
	@Test
	public void sets(){
		Set<String> set = ob.getSets();
		System.out.println(set);
	}
	
	//注入集合map
	@Test
	public void maps(){
		Map<String,Object> map = ob.getMaps();
		System.out.println(map);
	}
	
	//注入集合properties
	@Test
	public void props(){
		Properties p = ob.getProps();
		System.out.println(p.getProperty("jn"));
		System.out.println(p);
	}
	
	//注入集合对象student
	@Test
	public void stu(){
		Student stu = ob.getStu();
		System.out.println(stu.getId() + ":" + stu.getName());
	}
	
	
	
	
	
	
	
	
	
	
	

}
