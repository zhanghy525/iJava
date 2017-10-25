public class Exec5{
	//单例模式'
	//
	public static void main(String[] args){
		Student stu = Student.getStudent();
		System.out.println(stu.name + stu.age);
		//可以修改对象的属性,但是不能修改对象本身
		stu.age = 16;
		System.out.println(stu.name + stu.age);
	}
}
//醉汉式(效率)
class Student{
	String name;
	int age;
	private static Student stu = new Student("张三",15);

	private Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public static Student getStudent(){
		return stu;
	}

}
//懒汉式(省内存)
class Student{
	String name;
	int age;
	private static Student stu;

	private Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public static Student getStudent(){
		if(stu == null)
			stu = new Student("张三",15);
		return stu;
	}

}