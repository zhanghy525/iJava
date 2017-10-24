public class Exec5{
	public static void main(String[] args){
		for(int x=1;x<=5;x++){
			for(int y=1;y<=30;y++){
				//if(y%6==0)continue;
				System.out.println("第"+x+"個月的第"+y+"天需要上班");
			}
		}
		for(int x=1;x<=5;x++){
					for(int y=1;y<=30;y++){
						//if(y%6==0)continue;
						//if(x==3 && y==20)break;

						System.out.println("第"+x+"個月的第"+y+"天需要上班");
					}
		}
		a:for(int x=1;x<=5;x++){
			b:for(int y=1;y<=30;y++){
				if(x==3)break a;
					System.out.println("第"+x+"個月的第"+y+"天需要上班");
					}
		}
	}
}