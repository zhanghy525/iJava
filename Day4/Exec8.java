package yituday03;

public class Exec8 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 15;
		stu.name = "Tom";
		stu.score = 90;
		//��
		//if(stu.age < 18) {
		//	stu.score += 5;  
		//}			
		stu.show();
	}
}
class Student {
	String name;
	int age;
	int score;
	public void show() {
		//��
		if(age < 18) {
			score += 5;  
		}
		System.out.println(name + "ͬ�W �˴ο�ԇ" + score + "��");
	}
}