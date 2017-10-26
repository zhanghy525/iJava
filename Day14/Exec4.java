public class Exec4 {
	public static void main(String[] args){

		Person p1 = new Person("baby",28,'女');
		Person p2 = new Person("小明",39,'男');

		//baby女士今年28岁
		System.out.println(p1);
		//小明先生今年39岁
		System.out.println(p2);
	}
}

class Person{
	String name;
	int age;
	char gender;

	public Person(String name,int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString(){
		return name + (gender == '男' ? "先生今年" : "女士今年") + age + "岁";
	}

}