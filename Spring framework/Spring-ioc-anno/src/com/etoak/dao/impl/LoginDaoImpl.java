package com.etoak.dao.impl;

import org.springframework.stereotype.Repository;

import com.etoak.bean.User;
import com.etoak.dao.LoginDao;

/**
 * @Repository实例化对象
 * <bean id="loginDaoImpl" class="com.etoak.dao.impl.LoginDaoImpl"></bean>
 * id属性值默认为类名首字母小写 例如  LoginDaoImpl:loginDaoImpl
 * @Repository("loginDaoImpl") 定义别名
 */
@Repository("loginDaoImpl")
public class LoginDaoImpl implements LoginDao {
	
	@Override
	public String login(User user) {
		
		System.out.println("用户名：" + user.getUsername());
		System.out.println("密码：" + user.getPassword());
		
		return "获取用户：" + user.getUsername();
		
	}

}
