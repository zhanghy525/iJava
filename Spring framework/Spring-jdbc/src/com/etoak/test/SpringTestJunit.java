package com.etoak.test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import com.etoak.bean.User;
import com.etoak.dao.UserDao;

//spring和junit（单元测试）整合
@RunWith(SpringJUnit4ClassRunner.class)
//spring容器   加载applicationContext.xml   ApplicationContext
//路径加classpath 如果不加classpath默认查找当前类路径下的配置文件
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpringTestJunit {
	
	@Autowired
	private UserDao dao;
	
	//新增用户
	@Test
	public void add(){
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setUsername("add");
		user.setPassword(
				DigestUtils.md5DigestAsHex("123456".getBytes()));
		user.setNickname("易途");
		user.setEmail("etoak@et.com");
		user.setTel("110");
		user.setState(1);
		user.setCreateTime(new Date());
		
		int i = dao.add(user);		
		System.out.println("插入行数：" + i);
	}
	
	//通过主键查找用户
	@Test
	public void findUserByPrimaryKey(){
		String id = "92b404d7-3f7f-4776-8129-4eb87f225d88";
		User user = dao.findUserByPrimaryKey(id);
		if(user == null){
			System.out.println("数据为空！");
		}else{
			printInfo(user);
		}
	}
	
	//查询所有用户
	@Test
	public void getAll(){
		List<User> list = dao.getAll();
		for(User user : list){
			printInfo(user);
			System.out.println("--------------------------");
		}
	}
	
	//用户总数量
	@Test
	public void count(){
		System.out.println(dao.count());
	}
	
	//分页查询  username：条件 模糊查询   page：当前页 rows：每页记录数
	@Test
	public void selectPage(){
		String username = "";
		Integer page = 1;
		Integer rows = 2;
		
		List<User> list = dao.selectPage(username, page, rows);
		for(User user : list){
			System.out.println("ID:" + user.getId());
			System.out.println("USERNAME:" + user.getUsername());
			System.out.println("-------------------");
		}
	}
	
	private void printInfo(User user){
		System.out.println("ID：" + user.getId());
		System.out.println("用户名：" + user.getUsername());
		System.out.println("密码：" + user.getPassword());
		System.out.println("昵称：" + user.getNickname());
		System.out.println("邮箱：" + user.getEmail());
		System.out.println("联系方式：" + user.getTel());
		System.out.println("状态：" + 
					(user.getState() == 1 ? "启用" : "冻结"));
		System.out.println("创建时间：" + user.getCreateTime());
	}
	
	
	

}
