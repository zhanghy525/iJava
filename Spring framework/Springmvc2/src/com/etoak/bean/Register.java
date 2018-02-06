package com.etoak.bean;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

public class Register {
	
	private String  username;
	private String  password;
	private Integer gender;
	//springmvc不处理日期类型 需要开发人员自己处理
	//@DateTimeFormat处理请求参数 日期格式
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date    birthDay;
	private List<String> hobby;
	
	//private String[] hobby;
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
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

}
