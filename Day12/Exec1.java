public class Exec1{
	public static void main(String[] args){

		Student[] data = new Student[4];

		Student stu1 = new Student("�����S",20,66);
		Student stu2 = new Student(null,18,73);
		Student stu3 = new Student("���·�",20,93);
		Student stu4 = new Student("�����S",18,80);

		data[0] = stu1;
		data[1] = stu2;
		data[2] = stu3;
		data[3] = stu4;


		String name = "�����S";
		for(Student x:data){

			boolean temp = name.equals(x.name);
			//equals�M���ѹ̶������ݷ���ǰ�棬����l����ָᘮ���
			if(temp && x.age == 18){
				System.out.println(x.score);
			}
		}

	}
}

class Student{
	String name;
	int age;
	int score;
	public Student(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
}