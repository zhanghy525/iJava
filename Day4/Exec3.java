package yituday03;

public class Exec3 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name ="李四";
		teacher.age = 15;
		teacher.salary = 3000.0D;
		
		teacher.show();
	}
}

class Teacher {
	//name，salary，age
	String name;
	double salary;
	int age;
	
	//show
	void show() {
		//打印XX老师 今年XX岁 工资是XX
		System.out.println(name + "老师 今年"+age+"岁 工资是"+salary);
	}
}