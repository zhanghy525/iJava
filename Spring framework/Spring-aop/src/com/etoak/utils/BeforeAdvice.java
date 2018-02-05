package com.etoak.utils;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 非核心
 * BeforeAdvice 切面类  或 切面
 */
public class BeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 通知    之前通知 前置通知
	 * */
	@Override
	public void before(
			Method method, 
			Object[] args, 
			Object object
			) throws Throwable {
		
		System.out.println("===之前通知===");
		System.out.println("目标对象：" 
					+ object.getClass().getName());
		System.out.println("目标对象方法：" + method.getName());
		
		System.out.println("目标对象方法参数" );
		if(args.length > 0){
			for(Object arg : args){
				System.out.println(
						arg.getClass().getName() 
						+ "|" 
						+ arg);
			}
		}
		
		//method.invoke(obj, args);
		
	}

}
