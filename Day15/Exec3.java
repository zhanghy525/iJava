public class Exec3{
	public static void main(String[] args){
		Dog n1 = new Dog("Tom",1,"吉娃娃");
		Dog n2 = new Dog("Tom",2,"吉娃娃");

		System.out.println(n1.toString());

		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());

		System.out.println(n1.equals(n2));

		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
	}
}

class Dog{
	String name;
	int age;
	String type;

	public Dog(String name,int age,String type){
		this.name = name;
		this.age = age;
		this.type = type;
	}
	@Override
	public String toString(){

		StringBuffer s = new StringBuffer(name);
		s.append("今年");
		s.append(age);
		s.append("岁,属于");
		s.append(type);
		s.append("种类");

		return s.toString();
	}
	@Override
	public boolean equals(Object obj){

		if(obj == null)return false;
		if(!(obj instanceof Dog))return false;

		if(this == obj)return true;

		return this.name.equals(((Dog)obj).name) &&
			this.type.equals(((Dog)obj).type);
	}
	@Override
	public int hashCode(){

		return name.hashCode() + type.hashCode();
	}
}