package com.itheima;

import java.util.Random;

public class ThreeDoor {
	static Random ran = new Random();
	
	public static void main(String[] args) {
		boolean[] doors = new boolean[3];
		int temp = ran.nextInt(3) +1;
		doors[temp] =true;
		int choose = ran.nextInt(3) +1;
		int max = 0,min = 3;
		for(int x=0;x<doors.length-1;x++) {
			int mintemp = 3,maxtemp=0;
			if(!doors[x]) {
				if(x>maxtemp) {
					maxtemp = x;
				}
				if(x<mintemp) {
					mintemp = x;
				}
			}
			min = mintemp;
			max = maxtemp;
		}
		int pass = ran.nextInt(2)==0?min:max;
		
	}
	
	
	
	private int changeMind(int choosenDoor,int passDoor) {
		switch(choosenDoor+passDoor) {
		case 3:return 3;
		case 4:return 2;
		case 5:return 1;	
		default : return 0;
		}
	}
}

