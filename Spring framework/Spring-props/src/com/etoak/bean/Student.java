package com.etoak.bean;

public class Student {
	
	private String id;
	private String name;
	
	public Student(){
		System.out.println("student对象构造方法");
	}
	
	public void init(){
		System.out.println("student初始化方法");
	}
	
	public void destroy(){
		System.out.println("student销毁方法");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("setId方法：" + id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStu(){
		return "id:001,name:李四"; 
	}
	
	public String getStuParam(String str){
		return str;
	}
	
	public static String getStaticStu(){
		return "id:002,name:张三";
	}
	
	public static String getStaticStuParam(String str){
		return str;
	}

}
