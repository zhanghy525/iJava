package yituday03;

public class Exec1 {
	public static void main(String[] args) {
		TeacherExec1 teach = new TeacherExec1();
		teach.name = "张三";
		teach.gender = '男';
		teach.age = 30;
		teach.salary = 3000.00D;
		
		//teach.isMarry ='是';
		
		teach.isMarry = true;	
		String s;
		
		System.out.println("我是"+teach.name);
		System.out.println("我今年"+teach.age+"岁了");
		System.out.println("我是"+teach.gender+"生");
		System.out.println("我的薪水是"+teach.salary+"元");
		//三元运算
		s =teach.isMarry ? "我结婚了": "我没结婚";
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
		System.out.println("我要吃饭了");
	}
	
	//类是非public的，方法是public的？
	//类是非public的，而方法是public的，在其他包也是无法访问的

	void sleep() {
		System.out.println("我要睡觉了");
	}

	void teach() {
		System.out.println("我要上课了");
	}
}
