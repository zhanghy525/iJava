package com.rpggame;

import java.util.Scanner;

public class Player {
	// �Ԅe��������hp��mp��dc,���e,�I,id,Ƥ�w
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
		/*System.out.println("Ոݔ�����������");
		name = sc.next();
		if (name.equals("Tom")) {
			System.out.println("������Ո��������");
			create();
		} else {
			System.out.println("Ո�x������I��1��ʿ��2������3����");
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
				System.out.println("�����ɹ�");

			} else {
				System.out.println("����ʧ����Ո����ݔ��");
				create();
			}
		}*/

		/*
		 * try { switch(�I) { case 1: Warior wa = new Warior(); case 2: Mage wa = new
		 * Mage(); case 3: Hunter wa = new Hunter(); } } catch (Exception e) { // TODO:
		 * handle exception System.out.println("�]���ǂ��I"); } finally { }
		 */
	}

	public void setName() {
		System.out.println("Ոݔ�����������");
		name = sc.next();
		if (name.equals("Tom")) {
			System.out.println("������Ո��������");
			setName();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setWork() {
		System.out.println("Ո�x������I��1��ʿ��2������3����");
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
			System.out.println("�����ɹ�");

		} else {
			System.out.println("����ʧ����Ո����ݔ��");
			setWork();
		}
	}

	public void update() {
		
	}
	//չʾ���ˠ�B
	public void show() {
		System.out.println("name:"+ name);
		System.out.println("hp:"+ hp);
	}
	

}

