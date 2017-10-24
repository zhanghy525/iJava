public class Exec9{
	public static void main(String[] args){
		for(int x =1;x<=9 ;x++){
			for(int y =1;y<=x;y++){
				if(y<=x)
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
		int n = 5;
		for(int x=1;x<= n ;x++){
			for(int y=1;y<=n-x;y++)
			System.out.print(" ");
			for(int y=1;y<=2*x-1;y++)
			System.out.print("*");
			System.out.println();
		}
		for(int x=1;x<=n-1;x++){
			for(int y=1;y<=x;y++)
				System.out.print(" ");
			for(int y=1;y<=2*(n-x)-1;y++)
				System.out.print("*");
			System.out.println();
		}
		for(int x=1;x<= 2*n-1;x++){
			if(x<=n){
				for(int y=1;y<=n-x;y++)
					System.out.print(" ");
				for(int y=1;y<=2*x-1;y++)
					System.out.print("*");
			}else{
				for(int y=1;y<=x-n;y++)
					System.out.print(" ");
				for(int y=1;y<=4*n-2*x-1;y++)//2*(n-x)+(x-n-1)
					System.out.print("*");
			}
			System.out.println();
		}
		//
		int z=3;
		for(int x=1;x<=z;x++){
			for(int y=1;y<=n-x;y++)
				System.out.print(" ");
				System.out.print("*****");
			for(int y=1;y<=2*x;y++)
				System.out.print(" ");
				System.out.print("*****");
			System.out.println();
		}


	}
}