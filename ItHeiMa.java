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
		// ��ȡ����
		String str2 = str.substring(0, 7);// ��ȡ�ַ���
		/* ��ǰ������ */
		System.out.println(str2);
		String str3 = str.substring(0);
		System.out.println(str3);
		int len = str.length();// ��ȡ�ַ�������
		// ��ȡ��Ӧλ�õ��ַ�

	}

}
