package com.etoak.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.etoak.mapper.UserMapper;

public class JdkProxy implements InvocationHandler{

	public static void main(String[] args) throws IllegalArgumentException, ClassNotFoundException {
		JdkProxy proxy = new JdkProxy();
		UserMapper mapper = 
				(UserMapper)proxy.bind("com.etoak.mapper.UserMapper");
		int result = mapper.add(null);
		System.out.println("返回插入行数：" + result);
	}

	public Object bind(String target) throws IllegalArgumentException, ClassNotFoundException{
		return Proxy.newProxyInstance(
				this.getClass().getClassLoader(), 
				new Class<?>[]{Class.forName(target)},//代理
				this);	
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		String sql = "insert into et_user";
		System.out.println("执行sql：" + sql);
		Object result = 1;
		
		return result;
	}

}
