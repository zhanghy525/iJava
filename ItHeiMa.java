package com.itheima;

public class ItHeiMa {
	int x = 6;

	public void test() {
		String str = "ItheimaItheima";
		String[] s = new String[5];
		System.out.println(str.startsWith("It"));
		System.out.println(str.endsWith("ma"));
		System.out.println(str.contains("hei"));
		System.out.println(str.isEmpty());
		// 获取功能
		String str2 = str.substring(0, 7);// 截取字符串
		/* 包前不包后 */
		System.out.println(str2);
		String str3 = str.substring(0);
		System.out.println(str3);
		int len = str.length();// 获取字符串长度
		// 获取对应位置的字符

	}

}
