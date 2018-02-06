package com.etoak.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etoak.bean.Register;

@Controller //实例化对象 服务端 接收请求 响应
public class RegisterController {
	
	
	/**
	 * @RequestMapping接收请求 默认接收所有请求
	 *       value：接收请求地址
	 *       method：接收请求类型
	 *  
	 *  视图2种
	 *  ModelAndView   return new ModelAndView("success");
	 *  String         return "success";
	 *  
	 *  springmvc内置模型驱动
	 *      定义参数即可 底层会自动转换
	 *  springmvc集成servlet
	 *          HttpServletRequest
	 *          HttpServletResponse
	 *          HttpSession
	 *          
	 *          @Validated 
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(Register r,HttpServletRequest request){
		
		/****************springmvc API***********************/
		System.out.println("用户名：" + r.getUsername());
		System.out.println("密码：" + r.getPassword());
		System.out.println("生日：" + r.getBirthDay());
		System.out.println("性别：" + r.getGender());
		
		List<String> list = r.getHobby(); 
		if(list != null && list.size() > 0){
			for(String hobby : list){
				System.out.print(hobby + ",");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		/****************servlet API***********************/
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String birthDay = request.getParameter("birthDay");
		
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		System.out.println("性别：" + gender);
		System.out.println("生日：" + birthDay);
		
		if(hobby.length > 0){
			for(String h : hobby){
				System.out.print(h + ",");
			}
		}
		
		return "success";
	}

}
