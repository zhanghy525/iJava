package com.etoak.utils;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 非核心
 * AroundAdvice 切面类或切面
 */
public class AroundAdvice implements MethodInterceptor{

	/**
	 * 通知  环绕通知    之前和之后通知的组合
	 * */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("===环绕通知===");
		//目标对象
		Object object = invocation.getThis();
		//目标对象方法
		Method method = invocation.getMethod();
		//目标对象方法参数
		Object[] args = invocation.getArguments();
		
		System.out.println("目标对象：" + object.getClass().getName());
		System.out.println("目标对象方法：" + method.getName());
		
		
		start();//非核心操作
		//执行切入点方法    被代理的目标对象方法   login
		Object result = invocation.proceed();//核心操作
		end();//非核心操作
		
		return result;
	}
	
	public void start(){
		System.out.println("开启事务");
	}
	
	public void end(){
		System.out.println("提交事务");
	}

}
