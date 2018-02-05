package com.etoak.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.etoak.bean.User;

@Service("userDao")
public class UserDaoImpl implements UserDao {
	
	private static final String FIELD = "id,username,password,nickname,"
										+ "email,tel,state,create_time";
	
	//注入JdbcTemplate对象
	@Autowired
	private JdbcTemplate jt;

	/*public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}*/
    
	 
	@Override
	public int add(User user) {
		//定义sql语句
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into et_user(").append(FIELD).append(") ")
		   .append(" values(?,?,?,?,?,?,?,?) ");
		
		//定义参数
		Object[] args = new Object[]{
			user.getId(),
			user.getUsername(),
			user.getPassword(),
			user.getNickname(),
			user.getEmail(),
			user.getTel(),
			user.getState(),
			user.getCreateTime()
		};
		
		/*int result = 0;
		try{
			//编译执行sql语句，并返回插入数据条数
			 result = jt.update(sql.toString(), args);
			 int tx = 1/0;
		}catch(Exception e){
			 e.printStackTrace();
			 throw new RuntimeException();
		}*/
		
		//编译执行sql语句，并返回插入数据条数   add
		 int result = jt.update(sql.toString(), args);
		 
		 user.setId(UUID.randomUUID().toString());
		 user.setUsername("save");
		 save(user);
		 
		
		return result;
	}
  
	@Override
	public int update(User user) {
		return 0;
	}

	@Override
	public int delete(String id) {
		//定义sql语句
		String sql = "delete from et_user where id = ?";
		
		//编译执行sql语句，并返回删除数据条数
		int result = jt.update(sql,id);
		
		return result;
	}

	@Override
	public User findUserByPrimaryKey(String id) {
		//定义sql语句
		String sql = "select " 
					+ FIELD 
					+ " from et_user where id = ?";
		//编译执行sql语句，并返回结果集
		//Map<String,Object> map = jt.queryForMap(sql, id);
		//编译执行sql语句，并返回结果集
		List<Map<String,Object>> list = jt.queryForList(sql, id);
		
		//拼装返回信息
		if(list != null && list.size() > 0){
			Map<String,Object> map = list.get(0);
			return resultSet(map);
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		//定义sql语句
		String sql = "select " + FIELD + " from et_user";
		//编译执行sql语句，并返回结果集
		List<Map<String,Object>> list = jt.queryForList(sql);
		
		//定义返回参数
		List<User> result = null;
		//判断返回结果集是否为空
		if(list != null && list.size() > 0){
			//创建返回参数对象
			result = new ArrayList<>();
			//遍历结果集
			for(Map<String,Object> map : list){
				//创建User对象
				result.add(resultSet(map));
			}
		}
		
		return result;
	}

	@Override
	public List<User> selectPage(
			String username, Integer page, Integer rows) {
		//定义sql语句
		StringBuffer sql = new StringBuffer();
		sql.append(" select ")
		   			.append(FIELD)
		   .append(" from et_user where 1=1 ");
	  
	   //定义参数集合
	   List<Object> param = new ArrayList<>();
	   //判断条件
	   if(username != null && !"".equals(username)){
		   sql.append(" and username like ? ");
		   param.add("%" + username + "%");
	   }
	   
	   sql.append(" limit ?,? ");
	   param.add((page - 1) * rows);
	   param.add(rows);
	   
	   
	   System.out.println(sql);
	   
	  List<User> list = jt.query(sql.toString(), param.toArray(), 
			   new RowMapper<User>(){

					@Override
					public User mapRow(
							//数据库表返回的结果集
							ResultSet rs, 
							//行数 下标0开始 
							int index
							) throws SQLException {
						
						User user = new User();
						user.setId(rs.getString(1));
						user.setUsername(rs.getString(2));
						user.setPassword(rs.getString(3));
						user.setNickname(rs.getString(4));
						user.setEmail(rs.getString(5));
						user.setTel(rs.getString(6));
						user.setState(rs.getInt(7));
						user.setCreateTime(rs.getDate(8));
						
						return user;
					}
		   
	   		   }
	   );
	 
		   		
		return list;
	}

	@Override
	public long count() {
		//定义sql语句
		String sql = "select count(*) as count from et_user";
		
		/*jt.queryForInt(sql);
		jt.queryForLong(sql);*/
		
		//编译执行sql语句，并返回结果集
		Map<String,Object> map = jt.queryForMap(sql);
		long l = (Long)map.get("count");
		
		return l;
	}
	
	private User resultSet(Map<String,Object> map){
		User user = new User();
		//mysql 数据库表中字段  例如id   小写
		//oracle 数据库表中字段  例如id  大写
		user.setId(map.get("id") == null 
						? "" 
						: map.get("id").toString());
		user.setUsername(map.get("username").toString());
		user.setPassword((String)map.get("password"));
		user.setNickname(map.get("nickname").toString());
		user.setEmail(map.get("email").toString());
		user.setTel(map.get("tel").toString());
		user.setState((Integer)map.get("state"));
		user.setCreateTime((Date)map.get("create_time"));
		
		return user;
	}

	@Override
	public void save(User user) {
		//定义sql语句
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into et_user(").append(FIELD).append(") ")
		   .append(" values(?,?,?,?,?,?,?,?) ");
		
		//定义参数
		Object[] args = new Object[]{
			user.getId(),
			user.getUsername(),
			user.getPassword(),
			user.getNickname(),
			user.getEmail(),
			user.getTel(),
			user.getState(),
			user.getCreateTime()
		};
		
		//编译执行sql语句，并返回插入数据条数
		 int result = jt.update(sql.toString(), args);
		 //int tx = 1/0;
	}

}
