package com.etoak.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.etoak.bean.User;

//事务 <tx:annotation-driven>
@Transactional(readOnly = true)
// 用户
@Repository
public class UserDaoImpl implements UserDao {

	// 注入spring LocalSessionFcatoryBean（SessionFcatory）
	@Autowired
	private SessionFactory sessionFactory;

	// 登录
	@Override
	public User login(String username, String password) {

		// 需要手动开启事务和关闭事务 不依赖当前线程
		// sessionFactory.openSession()

		// 依赖当前线程 （使用事务决绝当前线程问题） 自动开启事务和关闭事务
		// No Session found for current thread
		Session session = sessionFactory.getCurrentSession();

		String hql = "from User where username = ? and password = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		User user = (User) query.uniqueResult();

		return user;
	}

}
