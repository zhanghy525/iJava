public class Exec1{
	public static void main(String[] args){
		Food f1 = new Food("猪蹄",10,"荤菜");
		Food f2 = new Food("猪蹄",10,"荤菜");
		Food f3 = new Food("海带",2,"素菜");
		String s = new String("s");
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
	}
}

class Food{
	String name;
	double price;
	String type;

	public Food(String name,double price,String type){
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj){
		Food f1 = this;
		Food f2 = (Food)obj;
		//return this.name == f2.name&&this.type == f2.type;

		//注意属性是引用数据类型的比较的时候也要用equals()



		return f1.name.equals(f2.name)&&f1.type.equals(f2.type);
	}
}