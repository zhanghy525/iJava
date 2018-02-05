package com.etoak.bean;

import java.io.InputStream;
import java.util.Properties;

public class Props {

	public static void main(String[] args) throws Exception {
		//创建对象
		Properties p = new Properties();
		
		//获取资源文件路径   
		//getClass 路径前/    getClassLoader()路径前不需要加/
		InputStream inStream = Props.class
			.getClassLoader()
			.getResourceAsStream("com/etoak/bean/props.properties");
		
		//加载资源文件信息 properties
		p.load(inStream);
		
		//输出信息
		String etoak = p.getProperty("etoak");
		String et    = p.getProperty("et");
		System.out.println(etoak + ":" + et);
		
		//第一个参数表示key 通过key获取value
		//第二个参数表示默认值 当key获取value为null时 默认值生效
		String et1710 = p.getProperty("et1710","1710");
		System.out.println(et1710);
		
		//设置属性值
		p.setProperty("abc", "123");
		System.out.println(p.getProperty("abc"));

	}

}
