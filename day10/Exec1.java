public class Exec1{
	public static void main(String[] args){

	}
}

class Animal{

}

class Person extends Animal{

	private String name;
	private char gender;

	public void eat(){
		System.out.println("人類吃食物");
	}
	public void play(){
		System.out.println("人會玩");
	}

}

class Docter extends Person{
	private double salary;

	@override
	public void eat(){
		System.out.println("醫生吃綠色食品");
	}

	public void cure(){
		System.out.println("醫生會治病");
	}
}

class Animal{

}

class Cat extends Animal{
	private String type;

	public void find(){
		System.out.println("貓會捉老鼠");
	}
}

class RestRoom{
	public void wc(){

	}
}
