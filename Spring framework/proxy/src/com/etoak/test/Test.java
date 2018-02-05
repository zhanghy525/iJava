package com.etoak.test;

import com.etoak.bean.IUser;
import com.etoak.bean.User;
import com.etoak.proxy.CglibProxy;
import com.etoak.proxy.JdkProxy;

public class Test {

	public static void main(String[] args) {
		System.getProperties()
		.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		
		jdkProxy();
	}
	
	//jdk代理
	public static void jdkProxy(){
		//代理对象
		JdkProxy proxy = new JdkProxy();
		
		//代理目标对象
		IUser user = (IUser)proxy.bind(new User());
		
		//user.del();
		
		//当前的add方法已经被代理
		String result = user.add("etoak", "et1710");
		
		//输出信息
		System.out.println("返回结果：" + result);
	}

	//cglib代理
	public static void cglibProxy(){
		//代理对象
		CglibProxy proxy = new CglibProxy();
		
		//代理目标对象
		User user = (User)proxy.bind(new User());
		
		//当前的add方法已经被代理
		String result = user.add("易途", "et1710");
				
		//输出信息
		System.out.println("返回结果：" + result);
	}
	
}
