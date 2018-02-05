package com.etoak.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.etoak.bean.User;
import com.etoak.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

@Controller
// @Scope("prototype")
public class LoginAction extends ActionSupport {

	// 注入dao层
	@Autowired
	private UserDao userDao;

	// 接收请求参数
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 登录
	public String login() {

		User user = userDao.login(username, password);

		HttpServletRequest request = ServletActionContext.getRequest();

		request.setAttribute("user", user);

		return this.SUCCESS;

	}

}
