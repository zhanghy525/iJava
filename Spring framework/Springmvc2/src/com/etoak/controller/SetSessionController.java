package com.etoak.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @SessionAttributes设置session范围
 *      将model和modelmap类型request范围设置成session范围
 */
@SessionAttributes(value={"m_session","mm_session"})
@Controller
public class SetSessionController {
	
	@RequestMapping(value="/sessionScope")
	public String sessionScope(
				Model m,
				ModelMap mm,
				HttpSession session
			){
		
		//设置session范围  model modelmap默认为request范围
		m.addAttribute("m_session", "et1710");
		mm.addAttribute("mm_session", "etoak");
		
		session.setAttribute("session", "易途");
		
		return "sessionScope";
	}

}
