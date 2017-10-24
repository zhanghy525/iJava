package com.itheima;

import java.util.Scanner;

public class Customer {
	private String name;
	private long phoneNumber;
	private double money;
	private int goodsId;
	private boolean wantBuy;
	Scanner sc = new Scanner(System.in);

	public Customer() {
		
	}

	public Customer(String name, long phoneNumber, double money) {
		setName(name);
		setPhone(phoneNumber);
		setMoney(money);
	}

	public Customer(String name, long number, double money, int id) {
		// setName(name);
		this.name = name;
		setPhone(number);
		setMoney(money);
		this.goodsId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPhone(long phone) {
		this.phoneNumber = phone;
	}

	public long getPhone() {
		return phoneNumber;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}
	//������Ʒ�������I���I���I�ļ���
	public void setId() {	
		System.out.print("���I�cɶ��?ݔ���ǻ��");
		String s = sc.next();
		if(s.equals("��")) {
			System.out.println("ݔ����Ʒ��̖��");
			this.goodsId = sc.nextInt();
		}else {
			goodsId = 0;
		}
	}

	public int getId() {
		return goodsId;
	}

	public void setWantBuy(boolean wantBuy) {
		this.wantBuy = wantBuy;
	}

	public Boolean getWantBuy() {
		return wantBuy;
	}

	// ԃ�r

	public int askPrice() {
		System.out.println("��"+goodsId+"����Ʒ�ăr��");
		return goodsId;
	}
	//�X�����r�£����]Ҫ��Ҫ�I��
	public void MakeUpMyMind(double price) {

		System.out.println("��Ʒ�ăr����:" + price + "���ĬF�����~��:" + getMoney());
		wantBuy = price <= getMoney() ? true : false;
		if (wantBuy) {
			System.out.println("���_��Ҫُ�I�᣿");
			// wantBuy = sc.nextBoolean();
			System.out.println("ݔ���ǻ��");
			String a = sc.next();
			// wantBuy = (a == "��") ? true : false;
		} else {
			wantBuy = !wantBuy;
		}
	}
	//�I���f����S��ʽ�����I���f�ٵ�
	public void tellMessage() {
		if (wantBuy) {
			System.out.print(getName() +" " +getPhone());
		} else {
			System.out.println("�ҾͲ����V��");
		}
	}

}
