public class Exec6{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Tom";
		p.age = 32;
		p.gender = 'Ů';
		p.salary = 3300.0;
		p.show();
	}
}

//����һ����
class Person {

	String name;
	//�����洢����
	int age;
	char gender;
	double salary;
	public void show() {

		System.out.println(name + (gender == '��'?"����":"Ůʿ")+" ����" + age + "�� ������" + salary);
	}
}