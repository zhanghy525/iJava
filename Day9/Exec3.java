import java.util.Random;

public class Exec3{
	public static void main(String[] args) {
		User tom = new User("Tom");
		tom.setPassWord("123456");

	}
}

class User{
	private String userName;
	private String passWord;
	private int userId;//=(int)(Math.random() * 900 +100)



	public User(String userName) {
		this.userName = userName;
		Random random =new Random();
		userId = random.nextInt(900)+100;
	}

	public void setPassWord(String passWord){
		this.passWord = passWord;
	}

	public void setUserId() {
		//Random random =new Random();
		//userId = random.nextInt(900)+100;
	}

	public int getUserId(){
		return userId;
	}

	public void show(){
		System.out.println(""+userName+"用戶~~ 系統爲你隨機生成的編碼是"+userId);
	}

}