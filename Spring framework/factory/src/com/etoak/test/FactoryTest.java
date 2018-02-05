package com.etoak.test;

import com.etoak.bean.Student;
import com.etoak.factorybean.FactoryBean;

public class FactoryTest {

	public static void main(String[] args) throws Exception {
		//实例对象  set方法赋值
		Student stu = (Student)FactoryBean.getBean("student");
		if(stu == null){
			System.out.println("对象为：" + stu);
		}else{
			//获取get方法
			System.out.println("ID：" + stu.getId());
			System.out.println("姓名：" + stu.getName());
			System.out.println("年龄：" + stu.getAge());
		}
	}

}
