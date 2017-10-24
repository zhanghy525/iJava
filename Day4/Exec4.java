package yituday03;

public class Exec4 {
	public static void main(String[] args) {
	
		add(10,5);
		add(2,6);
	}
	
	public static void add(int x, int y) {
		System.out.println(x +" + " + y + " = "+ (x+y));
		//先不要着急加加号
		//System.out.println(x "" y "" (x+y));
		//补加号
		//这样更快
	}
	
}
