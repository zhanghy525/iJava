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
		System.out.println("���ʳ��");
	}
	public void play(){
		System.out.println("�˕���");
	}

}

class Docter extends Person{
	private double salary;

	@override
	public void eat(){
		System.out.println("�t���ԾGɫʳƷ");
	}

	public void cure(){
		System.out.println("�t�����β�");
	}
}

class Animal{

}

class Cat extends Animal{
	private String type;

	public void find(){
		System.out.println("؈��׽����");
	}
}

class RestRoom{
	public void wc(){

	}
}
