package Day4;

public class Exec2 {
	public static void main(String[] args) {
		Teacher Tim = new Teacher();
		Tim.age =46;
		Tim.name = "Tim";
		Tim.gender = 'Ů';
		Tim.salary = 3000.0;
		if(Tim.age > 45 && Tim.gender =='Ů') {
			Tim.salary *= 1.1; 
		}
		Tim.show();
	}

}

class Teacher {
	String name;
	int age;
	char gender;
	double salary;
	void show() {
		System.out.println(name +"��ʦ ����" + age + "�� ����" + salary);
	}
}