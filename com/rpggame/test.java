package com.rpggame;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("�����ڼҟo�ĵĿ��ҕ��ͻȻ�ҕ��ը�ˣ�����׌����������Ҵ�Խ��������ʷ����������ʷǰ�����r��������");
		Sence se = new Sence();
		TinyGirl j = new TinyGirl();
		Player p = new Player();
		p.create();
		p.show();
		Scanner sc =new Scanner(System.in);
		
		int x = sc.nextInt();
		
	}
}