package com.etoak.utils;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 非核心
 * AfterAdvice 切面类或切面 
 * 
 * AfterReturningAdvice     切入点  返回值可有可无
 * AfterAdvice              切入点 没有返回值
 */
public class AfterAdvice implements AfterReturningAdvice{

	/**
	 * 通知  之后通知 后置通知
	 * */
	@Override
	public void afterReturning(
			Object result, //目标对象方法返回值   没有返回值 null
			Method method, //目标对象方法
			Object[] args, //目标对象方法参数
			Object object  //目标对象
			) throws Throwable {
		
		System.out.println("===之后通知===");
		System.out.println("目标对象：" + object.getClass().getName());
		System.out.println("目标对象方法：" + method.getName());
		
		//目标对象方法参数
		if(args.length > 0){
			for(Object arg : args){
				System.out.println(
						arg.getClass().getName() 
						+ "|" 
						+ arg);
			}
		}
		
		if(result != null){
			System.out.println("目标对象方法返回值类型：" 
						+ result.getClass().getName());
			System.out.println("目标对象方法返回值：" + result);
		}
		
	}

}
