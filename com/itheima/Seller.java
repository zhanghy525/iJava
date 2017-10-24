package com.itheima;

public class Seller {

	String[] goodsItem = { "板凳", "椅子", "沙發", "床", "桌" };
	double prices[] = {10.3, 50.0, 200, 999.9, 5000};
	
	public void show() {
		for(String goods : goodsItem ) System.out.print(goods+"  ");
		System.out.println();
	}
	
	public double showGoodsPrice(int goodsId) {
		if(goodsId < 1 || goodsId > prices.length) {
			System.out.println("對不起,我不買");
			return 99999.9;
		}else {
			return prices[goodsId-1];
		}
		
	}
	
	public void askMessage() {
		System.out.println("給個一下電話姓名擺");
	}
}
