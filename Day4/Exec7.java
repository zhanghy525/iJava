package yituday03;

public class Exec7 {
	public static void main(String[] args) {
		check(1512);
		
		int num = 512;
		int x = 512 / 100;
		System.out.println(num + "的百位數是" + x );
		int y = 512 / 10 % 10;
		//int y = 512 % 10 / 10;	
		System.out.println(num + "的十位數是" + y );
		int z = 512 % 10;
		System.out.println(num + "的個位數是" + z );
		
		
	}
	//個人練習
	public static void check(int x) {
		//晚上寫一個方法，用來取出各位數的方法
		
	}
}
