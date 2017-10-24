package yituday03;

public class Exec8 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 15;
		stu.name = "Tom";
		stu.score = 90;
		//①
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
		//②
		if(age < 18) {
			score += 5;  
		}
		System.out.println(name + "同學 此次考試" + score + "分");
	}
}