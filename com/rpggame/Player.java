package com.rpggame;

import java.util.Scanner;

public class Player {
	// 性別，姓名，hp，mp，dc,級別,職業,id,皮膚
	private int id;
	private int hp;
	private int mp;
	private int dc;
	private int grade;
	private char gender;
	private String name;
	private int work;
	private int Look;
	//

	Scanner sc = new Scanner(System.in);

	public Player() {

	}

	// get set

	//
	public void create() {
		setName();
		setWork();
		/*System.out.println("請輸入你的姓名：");
		name = sc.next();
		if (name.equals("Tom")) {
			System.out.println("重名，請您重新創建");
			create();
		} else {
			System.out.println("請選擇你的職業：1戰士，2法師，3弓手");
			work = sc.nextInt();
			if (work >= 1 && work <= 3) {
				if (work == 1) {
					Warior ne = new Warior();
					hp = ne.getHp();
					mp = ne.getMp();
					dc = ne.getDc();
				} else if (work == 2) {
					Mage ne = new Mage();
					hp = ne.getHp();
					mp = ne.getMp();
					dc = ne.getDc();
				} else {
					Hunter ne = new Hunter();
					hp = ne.getHp();
					mp = ne.getMp();
					dc = ne.getDc();
				}
				id = (int) (Math.random() * 900) + 100;
				System.out.println("創建成功");

			} else {
				System.out.println("創建失敗，請重新輸入");
				create();
			}
		}*/

		/*
		 * try { switch(職業) { case 1: Warior wa = new Warior(); case 2: Mage wa = new
		 * Mage(); case 3: Hunter wa = new Hunter(); } } catch (Exception e) { // TODO:
		 * handle exception System.out.println("沒有那個職業"); } finally { }
		 */
	}

	public void setName() {
		System.out.println("請輸入你的姓名：");
		name = sc.next();
		if (name.equals("Tom")) {
			System.out.println("重名，請您重新創建");
			setName();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setWork() {
		System.out.println("請選擇你的職業：1戰士，2法師，3弓手");
		work = sc.nextInt();
		if (work >= 1 && work <= 3) {
			if (work == 1) {
				Warior ne = new Warior();
				hp = ne.getHp();
				mp = ne.getMp();
				dc = ne.getDc();
			} else if (work == 2) {
				Mage ne = new Mage();
				hp = ne.getHp();
				mp = ne.getMp();
				dc = ne.getDc();
			} else {
				Hunter ne = new Hunter();
				hp = ne.getHp();
				mp = ne.getMp();
				dc = ne.getDc();
			}
			id = (int) (Math.random() * 900) + 100;
			System.out.println("創建成功");

		} else {
			System.out.println("創建失敗，請重新輸入");
			setWork();
		}
	}

	public void update() {
		
	}
	//展示個人狀態
	public void show() {
		System.out.println("name:"+ name);
		System.out.println("hp:"+ hp);
	}
	

}

