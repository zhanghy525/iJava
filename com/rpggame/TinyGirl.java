package com.rpggame;

public class TinyGirl extends Player {
	
	//name,location,age,gender,
	private int age;
	private int hp;
	private int mp;
	private int dc;
	
	//Ĭ�J
	
	//get?
	
	//show
	public void show() {
		System.out.println("Ů����s"+age+"��q�Ę���");
	}
	//chat
	public void chat() {
		int x = (int)(Math.random() * 10);
		switch (x & 1) {
		case 1: System.out.println("Ů������Ŀ����㣬����֪�������fʲ��");
		case 2: System.out.println("�]��Ҋ�Һ�æ�᣿��ȥ�̈́e��CHAT��");			
		}
	}
	//���Q����ĕ�����������Ʒ
	public void attack() {
		hp = hp -dc;
		if(isDeath(hp)) ;attack();
	}
	
	//�S��������������������Ʒ
	public void pritice() {
		hp -= dc;
		if(isDeath(hp)) ;pritice();
		
	}
	//�Д��ɫ�Ƿ��ѽ�����
	public boolean isDeath(int x) {
		return x>0;
	}
}
