package com.etoak.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {
	
	//target参数表示代理的目标对象
	public Object bind(final Object target){
		//第一个参数表示目标对象的类加载器
		//第二个参数表示目标对象的实现接口
		//第三个参数表示动态代理  代理目标对象 处理逻辑
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
                target.getClass().getInterfaces(), 
                 new InvocationHandler() {
					
					@Override
					public Object invoke(
							Object proxy, //代理对象  开发人员用不上
							Method method, //目标对象方法
							Object[] args  //目标对象方法参数 参数可有可无
							) throws Throwable {
						
						
						if("del".equals(method.getName())){
							Object result = method.invoke(target, args);
							return result;
						}
						
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
						
						//之前操作  非核心
						start();
						
						//代理目标对象 
						//默认情况下目标对象把所有的方法都交给代理 
						//第一个参数表示目标对象
						//第二参数表示目标对象方法参数
						//Object result 代理方法返回值  可有可无  
						Object result = method.invoke(target, args);
						
						//之后操作  非核心
						end();
						
						return result;
					}
					
				});
	}
	
	public void start(){
		System.out.println("开启事务");
	}
	
	public void end(){
		System.out.println("提交事务");
	}

}
