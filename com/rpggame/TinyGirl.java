package com.rpggame;

public class TinyGirl extends Player {
	
	//name,location,age,gender,
	private int age;
	private int hp;
	private int mp;
	private int dc;
	
	//默認
	
	//get?
	
	//show
	public void show() {
		System.out.println("女孩大約"+age+"來歲的樣子");
	}
	//chat
	public void chat() {
		int x = (int)(Math.random() * 10);
		switch (x & 1) {
		case 1: System.out.println("女孩天真的看著你，并不知道你在說什麽");
		case 2: System.out.println("沒看見我很忙嗎？你去和別人CHAT吧");			
		}
	}
	//對決，真的會死，掉落物品
	public void attack() {
		hp = hp -dc;
		if(isDeath(hp)) ;attack();
	}
	
	//聯係，死亡，但不會掉落物品
	public void pritice() {
		hp -= dc;
		if(isDeath(hp)) ;pritice();
		
	}
	//判斷角色是否已經死亡
	public boolean isDeath(int x) {
		return x>0;
	}
}
