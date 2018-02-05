package com.etoak.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.etoak.bean.User;
import com.etoak.service.LoginService;
import com.etoak.service.impl.LoginServiceImpl;

/**
 * @Controller实例化对象
 * <bean id="loginController" class="com.etoak.controller.LoginController"></bean>
 * id属性值默认为类名首字母小写 例如  LoginController:loginController
 */
@Controller
public class LoginController {
	
	/**
	 * controller层调用service层
	 * @Autowired 注入
	 *      只匹配类型  不找别名id  也不匹配包结构
	 *      默认生成setter getter
	 * @Resource 注入
	 *   默认先找别名 再找类型   
	 * @Resource(name="loginServiceImpl")
	 *    只找别名  没有找别名抛异常
	 * @Resource(type=LoginService.class)
	 *    只找类型  没有找类型抛异常
	 * @Resource(name="loginServiceImpl",type=LoginServiceImpl.class)
	 *    错一个都不行
	 */
	@Resource
	private LoginService loginService;
	
	public String login(User user){
		String result = null;
		
		try{
			result = loginService.login(user);
		}catch(RuntimeException e){//service抛出的异常username password
			//将异常信息打印到控制台
			e.printStackTrace();
			//e.getMessage() 获取抛出的信息
			result = e.getMessage();
		}catch(Exception e){//未知
			//将异常信息打印到控制台
			e.printStackTrace();
			//e.getMessage() 获取抛出的信息
			result = e.getMessage();
		}
		
		return result;
	}

}
