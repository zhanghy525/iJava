package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFactoryTest {

	public static void main(String[] args) {
		//spring容器
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("applicationContext-factory.xml");

		//获取实例工厂 无参数  getStu方法  返回值为String
	    String getStu = (String)ac.getBean("getStu");
	    //获取实例工程 有参数  getStuParam方法  返回值为String
	    String getStuParam = (String)ac.getBean("getStuParam");
	    //获取静态工厂 无参数 getStaticStu方法 返回值为String
	    String getStaticStu = (String)ac.getBean("getStaticStu");
	    //获取静态工厂 有参数 getStaticStuParam方法 返回值为String
	    String getStaticStuParam = (String)ac.getBean("getStaticStuParam");
	    
	    //输出信息
	    System.out.println("实例工厂无参数：" + getStu);
	    System.out.println("实例工厂有参数：" + getStuParam);
	    System.out.println("静态工厂无参数：" + getStaticStu);
	    System.out.println("静态工厂有参数：" + getStaticStuParam);
	}

}
