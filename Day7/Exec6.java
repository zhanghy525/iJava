public class Exec6{
	public static void main(String[] args){
		ystem.out.print(2+ " ");
		a:for(int x=3;x<=100;x+=2){
			b:for(int y=3;y<=100;y+=2){
				if(x % y ==0)continue a;
			}
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("***************************�A���ķָ�Q****************************");
		a:for(int x=2;x<=100;x++){
			b:for(int y=2;y<=Math.sqrt(x);y++){//��Math.sqrt���]���������������ܣ�
				if(x % y ==0)continue a;
			}
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("***************************�A���ķָ�Q****************************");
		for(int x=2;x<=100;x++){
			ff(x);
		}
	}
	public static void ff(int x){
			int count = 0;
			for(int y=1;y<=Math.sqrt(x);y++){
				if(x % y == 0)
					count++;
			}
			if(count<=2)
				System.out.print(x +" ");
	}
}