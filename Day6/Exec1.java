public class Exec1 {
	public static void main(String[] args){
		show(19);
		show(-1);
		show(28);

	}
	public static void show(int age) {
		if(age>38){
			System.out.println("老年");
		} else if (age>=29) {
			System.out.println("中年");
		} else if (age>=19) {
			System.out.println("青年");
		} else if (age>=0) {
			System.out.println("未成年");
		}else {
			System.out.println("年齡非法");
		}

	}
}
