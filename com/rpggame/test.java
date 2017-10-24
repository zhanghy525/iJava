package com.rpggame;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("我正在家無聊的看電視，突然電視爆炸了，而更讓人意外的是我穿越到了後人史書中描述的史前文明時代。。。");
		Sence se = new Sence();
		TinyGirl j = new TinyGirl();
		Player p = new Player();
		p.create();
		p.show();
		Scanner sc =new Scanner(System.in);
		
		int x = sc.nextInt();
		
	}
}