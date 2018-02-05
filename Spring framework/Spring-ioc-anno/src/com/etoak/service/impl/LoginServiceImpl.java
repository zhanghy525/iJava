package com.etoak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etoak.bean.User;
import com.etoak.dao.LoginDao;
import com.etoak.service.LoginService;

/**
 * @Service实例化对象
 * <bean id="loginServiceImpl" class="com.etoak.service.impl.LoginServiceImpl"></bean>
 * id属性值默认为类名首字母小写 例如  LoginServiceImpl:loginServiceImpl
 *  
 *  定义别名
 *  @Qualifier("loginServiceImpl")
 *	@Service    
 */
@Qualifier("loginServiceImpl")
@Service
public class LoginServiceImpl implements LoginService {
	
	/**
	 * service层调用dao层
	 * 注入dao层LoginDao接口
	 * 
	 * LoginDao loginDao = new LoginDaoImpl();
	 * 
	 * @Autowired 注入
	 *      只匹配类型  不找别名id  也不匹配包结构
	 *      默认生成setter getter
	 * @Qualifier("loginDaoImpl")
	 * @Autowired
	 *      只找别名  不找类型
	 */
	@Qualifier("loginDaoImpl")
	@Autowired
	private LoginDao loginDao;

	@Override
	public String login(User user) {
		//获取用户名参数
		String username = user.getUsername();
		//获取密码参数
		String password = user.getPassword();
		
		//判断用户名是否为空
		if(username == null || "".equals(username)){
			throw new RuntimeException("用户名不能为空！");
		}
		
		//判断密码是否为空
		if(password == null || "".equals(password)){
			throw new RuntimeException("密码不能为空！");
		}
		
		//service层调用dao
		String dao = loginDao.login(user);
		
		return dao;
	}

}
