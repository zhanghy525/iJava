package com.etoak.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value={"m_session","mm_session"})
@Controller
public class GetSessionController {
	
	@RequestMapping(value="/getSession")
	public String getSession(
				Model m,
				ModelMap mm,
				HttpSession session
			){
		
		String m_session = (String)mm.get("m_session");
		String mm_session = (String)mm.get("mm_session");
		String s = (String)session.getAttribute("session");
		
		System.out.println("通过ModelMap对象获取Model对象信息：" 
						+ m_session);
		System.out.println("获取ModelMap对象信息：" 
						+ mm_session);
		System.out.println("获取HttpSession对象信息：" 
						+ s);
		
		return "success";
		
	}

}
