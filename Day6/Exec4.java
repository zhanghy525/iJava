public class Exec4{
	public static void main(String[] args){
		for(int x =1; x<=100;x++){
			System.out.print(x +" ");
			if(x % 10 == 0)System.out.println();
		}
		for(char x ='a';x<='z';x++){
			System.out.print(x + " ");
			if(x % 10 == 0)System.out.println();
		}
	}
}