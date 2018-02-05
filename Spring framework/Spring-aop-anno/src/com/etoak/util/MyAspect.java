package com.etoak.util;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component//ioc 实例化  非dao service controller
@Aspect//切面类或切面 <aop:config>
public class MyAspect {
	
	//定义切入点 <aop:pointcut expression="execution(* com.etoak.controller.*.*(..))" id="p" />
	@Pointcut("execution(* com.etoak.controller.*.*(..))")
	public void etoak(){}
	
	//定义通知  前置通知 后置通知 环绕通知 异常通知
	
	//前置通知   <aop:advisor advice-ref="" pointcut-ref=""/>
	//JoinPoint 连接点
	@Before(value="etoak()")
	public void before(JoinPoint jp){
		//目标对象
		Object objThis = jp.getThis();
		//目标对象
		Object objTarget = jp.getTarget();
		//目标对象方法参数
		Object[] args = jp.getArgs();
		//目标对象方法 import org.aspectj.lang.Signature;
		Signature s = jp.getSignature();
		String methodName = s.getName();
		
		System.out.println("目标对象this：" + objThis.getClass().getName());
		System.out.println("目标对象target：" + objTarget.getClass().getName());
		if(args.length > 0){
			for(Object arg : args){
				System.out.println(
						arg.getClass().getName() 
						+ "|" 
						+ arg);
			}
		}
		
		System.out.println("目标对象方法：" + methodName);
	}

	//后置通知 
	//Object result获取目标对象方法返回值
	//returning="result"和Object result变量名称必须一致
	@AfterReturning(value="etoak()",returning="result")
	public void after(JoinPoint jp,Object result){
		//目标对象
		Object objThis = jp.getTarget();
		System.out.println("目标对象：" + objThis);
		//目标对象方法返回值
		System.out.println("目标对象方法返回值类型：" 
					+ result.getClass().getName());
		System.out.println("目标对象方法返回值：" + result);
	}
	
	//环绕通知 ProceedingJoinPoint只有环绕通知可以使用
	@Around(value="etoak()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("开启事务");
		//执行切入点方法    被代理的目标对象方法   login
		Object result = pjp.proceed();
		System.out.println("提交事务");
		
		return result;
		
	}
	
	//异常通知
	@AfterThrowing(value="etoak()",throwing="ex")
	public void ex(JoinPoint jp,Exception ex){
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
