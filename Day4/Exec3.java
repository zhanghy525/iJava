package yituday03;

public class Exec3 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name ="����";
		teacher.age = 15;
		teacher.salary = 3000.0D;
		
		teacher.show();
	}
}

class Teacher {
	//name��salary��age
	String name;
	double salary;
	int age;
	
	//show
	void show() {
		//��ӡXX��ʦ ����XX�� ������XX
		System.out.println(name + "��ʦ ����"+age+"�� ������"+salary);
	}
}