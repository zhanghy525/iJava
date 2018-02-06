package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping(value="/mvRedirect")
	public ModelAndView mvRedirect(HttpServletRequest request){

		/*ModelAndView mv = new ModelAndView(
				new RedirectView(
						request.getContextPath() + "/success.jsp"));*/


		ModelAndView mv =
				new ModelAndView("redirect:/success.jsp");

		return mv;
	}

	@RequestMapping(value="mvRedirect")
	public ModelAndView mvRedirect(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView(//重定向不走后台(加工程名,不加偶尔报错)
				new RedirectView(request.getContextPath()+"/success.jsp"));
		return mv;
	}
	@RequestMapping
	public String strRedirect() {

		return "redirect:/success.jsp";//加工程名,会报错
				//forward:/success.do 后台跳后台必须写
	}


}
