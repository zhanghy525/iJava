package com.etoak.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import com.etoak.bean.User;

public class UserFactory implements 
						FactoryBean<User>,
						InitializingBean{
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	//实例化对象
	@Override
	public User getObject() throws Exception {
		System.out.println("执行getObject方法");
		//实例化对象
		User user = new User();
		//注入
		user.setName(name);
		
		return user;
	}

	//对象类型
	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	//是否单例模式 默认false 非单例
	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行afterPropertiesSet方法");
	}

}
