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
	//看看商品，想想買不買，買哪件？
	public void setId() {	
		System.out.print("想買點啥嗎?輸入是或否");
		String s = sc.next();
		if(s.equals("想")) {
			System.out.println("輸入商品編號：");
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

	// 詢價

	public int askPrice() {
		System.out.println("第"+goodsId+"件商品的價格");
		return goodsId;
	}
	//錢夠的情況下，考慮要不要買呢
	public void MakeUpMyMind(double price) {

		System.out.println("商品的價格是:" + price + "您的現有余額是:" + getMoney());
		wantBuy = price <= getMoney() ? true : false;
		if (wantBuy) {
			System.out.println("您確定要購買嗎？");
			// wantBuy = sc.nextBoolean();
			System.out.println("輸入是或否");
			String a = sc.next();
			// wantBuy = (a == "是") ? true : false;
		} else {
			wantBuy = !wantBuy;
		}
	}
	//買就說真的聯係方式，不買就說假的
	public void tellMessage() {
		if (wantBuy) {
			System.out.print(getName() +" " +getPhone());
		} else {
			System.out.println("我就不告訴你");
		}
	}

}
