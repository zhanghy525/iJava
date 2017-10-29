public class Exec2{
	public static void main(String[] args){

		Teacher t1 = new Teacher("张三",18,6000);
		Teacher t2 = new Teacher("张三",18,6000);
		Teacher t3 = new Teacher("张三",18,6000);
		Teacher t4 = new Teacher("李四",18,6000);

		System.out.println(t1.equals(t2));
		System.out.println(t3.equals(t4));
	}
}

class Teacher{
	String name;
	int age;
	double salary;

	public Teacher(String name,int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj){

		Teacher t1 = this;
		Teacher t2 = (Teacher)obj;

		String n1 = t1.name;
		String n2 = t2.name;

		int a1 = t1.age;
		int a2 = t2.age;

		double s1 = t1.salary;
		double s2 = t2.salary;

		return n1.equals(n2) && a1 == a2 && s1 ==s2;
	}
}