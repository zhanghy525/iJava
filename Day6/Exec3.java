public class Exec3 {
	public static void main(String[] args) {
		doSth("���ڶ�");
		doSth("���ڰ�");
	}
	public static void doSth(String day) {
		switch(day){
			case "����һ":
			case "������":
			case "������": System.out.println("���");break;
			case "���ڶ�":
			case "������": System.out.println("���Ӱ");break;
			case "������":
			case "������": System.out.println("�_����");break;
			default : System.out.println("�ϵ��f�]���@һ��");
		}
	}
}