package com.rpggame;

public class Warior extends Player{
	private int hp =200;
	private int mp =50;
	private int dc = 10;
	private int hit; 
	
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getDc() {
		return dc;
	}
	//½ÇÉ«¼¼ÄÜ
	public void charge(int x,int grade) {
		int min = 159 + 21 * grade;
		int max = 221 + 25 * grade;
		int y = (int)(Math.random() * (max-min)) + min;
		hit = hit * y / 100;
	}
	
	public void execute() {
		
	}
}
