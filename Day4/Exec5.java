package yituday03;

public class Exec5 {
	public static void main(String[] args) {
		check(16);
		check(17);
	}

	// �ǲ���8�ı��������Ǵ�ӡ���ֵ�2��

	public static void check(int x) {
		if (x % 8 == 0) {
			System.out.println(x);
		} else {
			System.out.println(x * 2);
		}
		/*
		 * int y = x % 2 ==0 ? x : 2 * x;
		 * System.out.println(y);
		 */
	}
}
