package yituday03;

public class Exec6 {
	public static void main(String[] args) {
		check(100);
		check(1000);
	}
	public static void check(int x) {
		//100 - 100 % 8
		System.out.println(x - x % 8);
		System.out.println(x / 8 * 8);
	}

}
