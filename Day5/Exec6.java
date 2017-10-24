public class Exec6{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Tom";
		p.age = 32;
		p.gender = '女';
		p.salary = 3300.0;
		p.show();
	}
}

//这是一个类
class Person {

	String name;
	//用来存储名字
	int age;
	char gender;
	double salary;
	public void show() {

		System.out.println(name + (gender == '男'?"先生":"女士")+" 今年" + age + "岁 工资是" + salary);
	}
}