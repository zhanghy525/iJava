public class Exec1{
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.setName("Tom");
		d1.setAge(1);
		d1.setType("tiny");

		Dog d2 = new Dog("Jack",2,"big");

	}
}
class Dog{
	//屬性
	private String name;
	private int age;
	private String type;

	//構造
	public Dog(){

	}

	public Dog(String name,int age,String type){
		this.name = name;
		this.age = age;
		this.type = type;
	}

	//get||set
	public void setName(String name){
		this.name =name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setType(String type){
		if(type.equals("tiny")||type.equals("big")||type.equals("mid")){
			this.type = type;
		}else{
			System.out.println("類型不符合要求");
		}


	}

	public String getType(){
		return type;
	}
}