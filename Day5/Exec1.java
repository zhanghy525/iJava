package Day4;

public class Exec1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "p";
		p.gender = '女';
		p.age = 32;
		p.show();
	}

}
class Person {
	String name;
	int age;
	char gender;
	void show() {
		if(gender == '男') {
			System.out.println(name+"先生 今年"+age+"岁");
		}else {
			System.out.println(name+"女士 今年"+age+"岁");			
		}
	}
}
