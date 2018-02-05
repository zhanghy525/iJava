package com.etoak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.etoak.bean.User;
import com.etoak.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	/**
	 *  
	 *  timeout=-1
	 *  默认-1 表示永不超时
	 *  
	 *  rollbackForClassName="java.lang.Exception"
	 *  rollbackFor=Exception.class
	 *    遇到什么异常回滚
	 *    
	 *  readOnly=false
	 *  	设置只读  true：只读
	 * 
	 *  noRollbackFor=Exception.class,
	 *  noRollbackForClassName="java.lang.Exception"
	 *   遇到什么异常不回滚
	 */
	@Transactional(propagation=Propagation.REQUIRED,timeout=-1,
			rollbackForClassName="java.lang.Exception",
			rollbackFor=Exception.class,readOnly=false
			)
	public int add(User user){
		int result = userMapper.add(user);
		//int tx = 1/0;
		return result;
	}
	
	/**
	 * @param username 用户名
	 * @param page     当前页
	 * @param rows     每页记录数
	 * @return
	 */
	public List<User> selectPage(
			String username,Integer page,Integer rows){
		//第一个参数表示当前页
		//第二个参数表示每页记录数
		//当前页和每页记录数计算公式  只是计算公式 
		PageHelper.startPage(page, rows);
		//查询sql返回结果集
		//pagehelper拿 select * from 表名 where id = 1 limit (page-1) * rows,rows
		List<User> list = userMapper.selectPage(username);
		
		//计算公式 获取额外参数
		PageInfo<User> pi = new PageInfo<>(list);
		
		// 1
		System.out.println("首页：" + pi.getFirstPage());
		// page + 1
		System.out.println("下一页：" + pi.getNextPage());
		// page - 1
		System.out.println("上一页：" + pi.getPrePage());
		// 总页数值  总记录数 + 每页记录数 - 1 /  每页记录数
		//        总记录数 % 每页记录数  
		System.out.println("末页：" + pi.getLastPage());
		
		System.out.println("当前页：" + pi.getPageNum());
		System.out.println("每页记录数" + pi.getPageSize());
		
		//select count(*) from (select * from 表名 where id = 1)
		System.out.println("总记录数：" + pi.getTotal());
		
		
		return list;
	}
	
}
