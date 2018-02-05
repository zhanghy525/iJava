package com.etoak.dao;

import java.util.List;

import com.etoak.bean.User;

public interface UserDao {
	//新增用户
	public int add(User user);
	//通过主键ID修改用户
	public int update(User user);
	//通过主键ID删除用户
	public int delete(String id);
	//通过主键查找用户
	public User findUserByPrimaryKey(String id);
	//查询所有用户
	public List<User> getAll();
	//分页查询  username：条件 模糊查询   page：当前页 rows：每页记录数
	public List<User>
		selectPage(String username,Integer page,Integer rows);
	//用户总数量
	public long count();
	
	public void save(User user);
}
