public class Exec2{
	public static void main(String[] args){
		String x = getColor(3);
		System.out.println(x);
	}
	/*
	public static String getColor(int number) {
		if(number == 1) return "1̖���Sɫ";
		else if(number == 2)
		return "2̖��tɫ";
		else
		return "3̖����ɫ";
	}
	*/
	public static String getColor(int number) {
		switch(number) {
			case 1: ;return "һ̖���Sɫ";
			case 2: ;return "��̖���Sɫ";
			case 3: ;return "��̖���Sɫ";
			default:;return "�����e�`";
		}
	}

}
