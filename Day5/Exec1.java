package Day4;

public class Exec1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "p";
		p.gender = 'Ů';
		p.age = 32;
		p.show();
	}

}
class Person {
	String name;
	int age;
	char gender;
	void show() {
		if(gender == '��') {
			System.out.println(name+"���� ����"+age+"��");
		}else {
			System.out.println(name+"Ůʿ ����"+age+"��");			
		}
	}
}
