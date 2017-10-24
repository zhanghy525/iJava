package com.itheima.rpggame;

public class Player {
	private String name;
	private int hp;
	
	public Player(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	
	public void talkToNpc(NpcPlayer npc) {
		System.out.println("(｡･∀･)ﾉﾞ嗨~~");
		npc.talkBack();
	}

}
