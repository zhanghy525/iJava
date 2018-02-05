package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.bean.Student;

public class SpringTest {

	public static void main(String[] args) {
		//spring启动容器 初始化对象 注入
		ClassPathXmlApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//父类引用指向子类对象 左属性  右方法
		// 左   int i = 1  test() = 1   ApplicationContext                          
		// 右   int i = 2  test() = 2   ClassPathXmlApplicationContext
		//   ac.i    1    ac.test() 2
		
		//获取spring管理对象student
		//Student stu = (Student)ac.getBean("student");
		Student stu = (Student)ac.getBean("stu");
		
		//输出信息
		System.out.println("ID:" + stu.getId());
		System.out.println("NAME:" + stu.getName());
		
		//((ClassPathXmlApplicationContext)ac).close();
		ac.close();
	}

}
