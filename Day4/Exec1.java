package yituday03;

public class Exec1 {
	public static void main(String[] args) {
		TeacherExec1 teach = new TeacherExec1();
		teach.name = "����";
		teach.gender = '��';
		teach.age = 30;
		teach.salary = 3000.00D;
		
		//teach.isMarry ='��';
		
		teach.isMarry = true;	
		String s;
		
		System.out.println("����"+teach.name);
		System.out.println("�ҽ���"+teach.age+"����");
		System.out.println("����"+teach.gender+"��");
		System.out.println("�ҵ�нˮ��"+teach.salary+"Ԫ");
		//��Ԫ����
		s =teach.isMarry ? "�ҽ����": "��û���";
		System.out.println(s);
		
		teach.eat();
	}
}

class TeacherExec1 {
	String name;
	int age;
	char gender;
	double salary;
	boolean isMarry;

	void eat() {
		System.out.println("��Ҫ�Է���");
	}
	
	//���Ƿ�public�ģ�������public�ģ�
	//���Ƿ�public�ģ���������public�ģ���������Ҳ���޷����ʵ�

	void sleep() {
		System.out.println("��Ҫ˯����");
	}

	void teach() {
		System.out.println("��Ҫ�Ͽ���");
	}
}
