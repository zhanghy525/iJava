package com.etoak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller()//实例化对象 服务端
public class LoginController {
	
	/**
	 * @RequestMapping接收请求
	 * @RequestParam接收请求参数
	 *    例如： String username = getParameter("uname")
	 *    @RequestParam注解参数
	 *    	value：接收请求参数
	 *      required：判断请求参数是否存在  默认true 
	 *          true表示请求参数必须存在   否则抛异常
	 *          false表示请求参数可以忽略    接收参数为null
	 *      defaultValue：请求参数如果为null 设置默认值
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(
			@RequestParam(value="username") String username,
			@RequestParam(value="pwd") String password){
		
		//处理业务
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		
		//跳转视图
		ModelAndView mv = new ModelAndView("success");
		
		return mv;
	}

}
