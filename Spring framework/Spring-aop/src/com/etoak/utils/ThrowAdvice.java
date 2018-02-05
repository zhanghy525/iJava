package com.etoak.utils;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * 非核心
 * ThrowAdvice 切面类或切面
 */    
public class ThrowAdvice implements ThrowsAdvice{
	
	/**
	 * 通知 异常通知
	 */
	public void afterThrowing(
			Method method, 
			Object[] args, 
			Object target, 
			Exception ex){
		System.out.println("目标对象：" + target.getClass().getName());
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
		
		System.out.println("异常信息：" + ex.getMessage());
		
		try(FileOutputStream out = 
				new FileOutputStream("C:/1.txt",true);
			PrintWriter pw = 
				new PrintWriter(out);){
			
			ex.printStackTrace(pw);
			
		}catch(Exception e){
			//将异常信息输出到控制台
			e.printStackTrace();
		}
	}
 
}
