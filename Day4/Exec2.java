package yituday03;

public class Exec2 {
	public static void main(String[] args) {
		User usr1 = new User();
		usr1.userName = "����";
		System.out.println(usr1.userName);
		usr1.passWord = "123456";
		System.out.println(usr1.passWord);
		usr1.phone = 18366154631L;
		System.out.println(usr1.phone);
		System.out.println(usr1.userId);
		usr1.ע��();
		usr1.��½();
	}
}

class User {
	String userName;
	String passWord;
	Long phone;
	//
	// int userId = (int) (Math.random());
	// int userId = (int) (Math.random() * 1000);
	int userId = (int) (Math.random() * 900 + 100);// ע�ⲻҪ����0-99

	public void ע��() {
		System.out.println("�������û����ҵ���ע��");
	}

	public void ��½() {
		System.out.println("�������û�����¼������");
	}

}