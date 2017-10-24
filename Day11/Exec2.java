public class Exec2{
	public static void main(String[] args){
		Teacher tea = new Teacher("ˆÈı",13,3000D);
		tea.show();
	}
}
class Person {
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

}

class Teacher extends Person {
	double salary;

	public Teacher(String name,int age,double salary){
		super(name,age);
		this.salary = salary;
	}
	public void show(){
		System.out.println(name + age + salary);
	}
}