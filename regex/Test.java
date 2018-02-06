package com.etoak.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	/**
	 * 
	 * X  字符   例如a
	 * 星（*） 零次或多次  a*  例如aaaaaa成立
	 * 		  a*b   a* a表示可以出现零次或多次  b默认字符输出只能出现一次
	 * ?      零次或一次
	 * +      一次或多次
	 * {n}  必须出现n次
	 * {n,} 最少n次，多了不限
	 * {n,m} 最少n次，最多m次
	 * [abc]  包含
	 * [^abc]  不包含
	 * 点（.） 任何字符 
	 * \d 数字：[0-9] 
	 * ^ 行的开头 
	 * $ 行的结尾 
	 *  \\ 转义正则表达式关键字
	 *  | 或
	 *  
 	 * */
	public static void main(String[] args) {
		
		 //定义正则表达式     etoak@et.com
		 Pattern p = Pattern.compile("[a-zA-z0-9]+\\@[a-zA-z0-9]+\\.(com|cn|ent)");
		 //定义内容
		 Matcher m = p.matcher("etoak@et.com");
		 //定义内容是否和定义正则表达式是否一致
		 boolean b = m.matches();
		 
		 System.out.println(b);
		 
		 /*
		 System.out.println(m.group(0));//ABC
		 System.out.println(m.group(1));//ABC
		 System.out.println(m.group(2));//A
		 System.out.println(m.group(3));//BC
		 System.out.println(m.group(4));//C
		 */
		 
	}

}
