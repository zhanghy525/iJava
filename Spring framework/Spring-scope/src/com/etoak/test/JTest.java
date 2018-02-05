package com.etoak.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JTest {
	
	/**
	 * junit定义方法时 不要定义返回值  方法不要定义参数
	 * @Test 执行  但是不是主线程
	 * */

	@Before
	public void before(){
		System.out.println("之前执行！");
	}
	
	@Test
	public void test(){
		System.out.println("业务逻辑");
	}


	@After
	public void after(){
		System.out.println("之后执行！");
	}
}
