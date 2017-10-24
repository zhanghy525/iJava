package com.itheima.rpggame;

public class NpcPlayer {
	private String name;
	private int hp;
	
	public NpcPlayer(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	
	public void talkBack() {
		System.out.println("你去撩別人吧，我沒有空~~");
	}

}
