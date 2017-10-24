public class Exec4{
	public static void main(String[] args){
		char x = 49;
		char y = 51;
		char z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
	}

}