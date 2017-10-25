public class Exec4{
	public static void main(String[] args){

		Student stu = new Student("张三",18,'男');
		insert(stu);

	}
	//插入用来拼装的sql语句
	public static void insert(Person per){

		StringBuffer sb = new StringBuffer("insert into ");
		sb = sb.append(per.getClass().getName());
		sb = sb.append("(name,age,gender) values ('");
		sb = sb.append(per.getName());
		sb = sb.append("',");
		sb = sb.append(per.getAge());
		sb = sb.append(",'");
		sb = sb.append(per.getGender());
		sb = sb.append("');");

		System.out.println(sb);

	}
}

class Person {
	private String name;
	private int age;
	private char gender;

	public Person(String name,int age,char gender){
		this.name =name;
		this.age = age;
		this.gender = gender;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setGender(char gender){
		this.gender = gender;
	}

	public char getGender(){
		return gender;
	}

}

class Student extends Person{

	public Student(String name,int age,char gender){
		super(name,age,gender);
	}
}

class Teacher extends Person{

	public Teacher(String name,int age,char gender){
			super(name,age,gender);
	}
}
