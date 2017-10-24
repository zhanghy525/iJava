package com.itheima;

public class test2{
	public static void main(String[] args){
		a:for(int x=1;x<=100;x++){
			b:for(int y=2;y<x;y++){
				if(x % y ==0){
					continue a;
				}
			}
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("*******************************************************");
		a:for(int x=1;x<=100;x++){
			b:for(int y=2;y<=Math.sqrt(x);y++){
				if(x % y ==0){
					continue a;
				}
			}
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("*******************************************************");
		a:for(int x=1;x<=100;x++){
			b:for(int y=2;y<=Math.sqrt(x);y++){
				if(x % y ==0){
					continue a;
				}
			}
			System.out.print(x+ " ");
		}
		String eto ="etock";
		
		for(int x1=0;x1<eto.length();x1++){
			char x =eto.charAt(x1);
			System.out.print(x);
		}
		
	}
}
