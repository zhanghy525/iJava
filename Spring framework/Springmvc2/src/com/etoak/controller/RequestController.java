package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {
	
	/**
	 *   springmvc 
	 *     内置对象   默认为request范围   
	 *     Model     设置  add
	 *     ModelMap  add get remove
	 */
	@RequestMapping(value="/requestScope")
	public String requestScope(
			Model m,
			ModelMap mm,
			HttpServletRequest request){
		
		//设置 request范围参数
		m.addAttribute("m_request", "etoak");
		mm.addAttribute("mm_request", "et1710");
		
		request.setAttribute("req", "易途");
		
		return "requestScope";
	}

}
