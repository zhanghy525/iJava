package com.etoak.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {

	// 容器（tomcat）关闭执行contextDestroyed方法
	@Override
	public void contextDestroyed(ServletContextEvent sc) {
		System.out.println("执行contextDestroyed方法");
		ServletContext app = sc.getServletContext();
		String etoak = (String) app.getAttribute("etoak");
		System.out.println("value:" + etoak);
	}

	// 容器（tomcat）启动执行contextInitialized方法
	@Override
	public void contextInitialized(ServletContextEvent sc) {
		System.out.println("执行contextInitialized方法");
		ServletContext app = sc.getServletContext();
		app.setAttribute("etoak", "et1710");
	}

}
