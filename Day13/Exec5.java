public class Exec5{
	//����ģʽ'
	//
	public static void main(String[] args){
		Student stu = Student.getStudent();
		System.out.println(stu.name + stu.age);
		//�����޸Ķ��������,���ǲ����޸Ķ�����
		stu.age = 16;
		System.out.println(stu.name + stu.age);
	}
}
//��ʽ(Ч��)
class Student{
	String name;
	int age;
	private static Student stu = new Student("����",15);

	private Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public static Student getStudent(){
		return stu;
	}

}
//����ʽ(ʡ�ڴ�)
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
			stu = new Student("����",15);
		return stu;
	}

}