package com.etoak.mapper;

import org.springframework.stereotype.Repository;

import com.etoak.bean.User;
import com.etoak.dao.LoginDao;

@Repository
public class LoginMapper implements LoginDao {

	@Override
	public String login(User user) {
		System.out.println("loginMapper");
		return "loginMapper";
	}

}
