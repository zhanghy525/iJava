package Day4;

public class Exec3{
	public static void main(String[] args){
		int x = 5;
		int y;
		if(x++ > 5 & ++x > 10 ){
			y = x; //
			System.out.println(x);
		}
		System.out.println(y);
	}

}