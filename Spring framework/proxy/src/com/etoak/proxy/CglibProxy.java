package com.etoak.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	
	//target参数表示目标对象
	public Object bind(Object target){
		
		//定义代理对象
		Enhancer e = new Enhancer();
		
		//定义代理目标对象
		e.setSuperclass(target.getClass());
		
		//定义回调函数   处理 代理目标对象
		e.setCallback(this);
		
		//创建代理
		return e.create();
	}

	@Override
	public Object intercept(
			Object object, //目标对象
			Method method, //目标对象方法
			Object[] args, //目标对象方法参数
			MethodProxy proxy//代理对象
			) throws Throwable {
		
		System.out.println("开启事务");
		//代理目标对象 
		//默认情况下目标对象把所有的方法都交给代理 
		//第一个参数表示目标对象
		//第二参数表示目标对象方法参数
		//Object result 代理方法返回值  可有可无  
		Object result = proxy.invokeSuper(object, args);
		System.out.println("提交事务或回滚事务");
		
		return result;
	}

}
