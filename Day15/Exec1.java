public class Exec1{
	public static void main(String[] args){
		Food f1 = new Food("����",10,"���");
		Food f2 = new Food("����",10,"���");
		Food f3 = new Food("����",2,"�ز�");
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

		//ע�������������������͵ıȽϵ�ʱ��ҲҪ��equals()



		return f1.name.equals(f2.name)&&f1.type.equals(f2.type);
	}
}