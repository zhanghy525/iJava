public class Exec3{
	public static void main(String[] args){
		for(int x=1;x<=5;x++){
			for(int y=1;y<=6;y++){
				if((x & 1)==0 && y==6)continue;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}