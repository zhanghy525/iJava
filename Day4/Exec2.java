package yituday03;

public class Exec2 {
	public static void main(String[] args) {
		User usr1 = new User();
		usr1.userName = "张三";
		System.out.println(usr1.userName);
		usr1.passWord = "123456";
		System.out.println(usr1.passWord);
		usr1.phone = 18366154631L;
		System.out.println(usr1.phone);
		System.out.println(usr1.userId);
		usr1.注册();
		usr1.登陆();
	}
}

class User {
	String userName;
	String passWord;
	Long phone;
	//
	// int userId = (int) (Math.random());
	// int userId = (int) (Math.random() * 1000);
	int userId = (int) (Math.random() * 900 + 100);// 注意不要包含0-99

	public void 注册() {
		System.out.println("我是新用户，我得先注册");
	}

	public void 登陆() {
		System.out.println("我是老用户，登录就行了");
	}

}