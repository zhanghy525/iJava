public class Exec4 {
	public static void main(String[] args){

		Person p1 = new Person("baby",28,'Ů');
		Person p2 = new Person("С��",39,'��');

		//babyŮʿ����28��
		System.out.println(p1);
		//С����������39��
		System.out.println(p2);
	}
}

class Person{
	String name;
	int age;
	char gender;

	public Person(String name,int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString(){
		return name + (gender == '��' ? "��������" : "Ůʿ����") + age + "��";
	}

}