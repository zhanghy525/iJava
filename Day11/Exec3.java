public class Exec3{
	public static void main(String[] args){
		User us = new User("Tomcate","123456789");
	}
}
class User{
	String name;
	String passWord;

	public User(String name,String passWord){
		if(passWord.length() < 12 && name.length() > 6){
			System.out.println("×¢ƒÔÊ§”¡");
		}else{
			this.name = name;
			this.passWord = passWord;
		}
	}
}