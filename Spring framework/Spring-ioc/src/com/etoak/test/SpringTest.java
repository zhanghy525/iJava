package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.etoak.bean.ClassRoom;
import com.etoak.bean.Student;

public class SpringTest {

	public static void main(String[] args) {
		//setter();
		//constructor("stuI");
		method("methodStu");
	}
	
	private static void setter(){
		//创建spring容器 实例对象 并依赖注入
		//默认加载src路径下配置文件
		ClassPathXmlApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//启动容器
		//ac.start();
		
		//获取容器对象Student别名为stu
		Student stu = (Student)ac.getBean("stu");
		//判断对象是否存在   并输出信息
		if(stu == null){
			System.out.println("对象为：" + stu);
		}else{
			System.out.println("ID：" + stu.getId());
			System.out.println("姓名：" + stu.getName());
			System.out.println("年龄：" + stu.getAge());
		}
		
	}
	
	
	public static void constructor(String id){
		//spring创建容器 实例对象 并依赖注入  指定文件路径   绝对路径
		ApplicationContext ac = new 
		FileSystemXmlApplicationContext("src/applicationContext.xml");
		//获取容器对象Student别名为stu
		Student stu = (Student)ac.getBean(id);
		//判断对象是否存在   并输出信息
		if(stu == null){
			System.out.println("对象为：" + stu);
		}else{
			System.out.println("ID：" + stu.getId());
			System.out.println("姓名：" + stu.getName());
			System.out.println("年龄：" + stu.getAge());
		}
	}
	
	public static void method(String id){
		//spring创建容器 实例化对象 依赖注入
		ApplicationContext ac =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取对象ClassRoom
		ClassRoom cr = (ClassRoom)ac.getBean(id);
		
		//通过getStu方法获取Student对象
		Student stu = cr.getStu();
		
		//判断对象是否存在   并输出信息
		if(stu == null){
			System.out.println("对象为：" + stu);
		}else{
			System.out.println("ID：" + stu.getId());
			System.out.println("姓名：" + stu.getName());
			System.out.println("年龄：" + stu.getAge());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
