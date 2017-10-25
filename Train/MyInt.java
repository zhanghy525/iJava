package day1;

public class MyInt {
	public static void main(String[] args) {

		f2(10);
		System.out.println();
		f3(10);
		System.out.println();

	}

	public static void f1(int x) {
		x--;
		System.out.print(x);
		if (x > 2) {
			f1(x);

		}
	}

	public static void f2(int x) {
		x--;

		if (x > 2) {
			System.out.print(x);
			f2(x);
		}
	}

	public static void f3(int x) {
		x--;

		if (x > 2) {
			f3(x);
			System.out.print(x);
		}
	}

}
