public class Exec5{
	public static void main(String[] args){
		for(int x=1;x<=5;x++){
			for(int y=1;y<=30;y++){
				//if(y%6==0)continue;
				System.out.println("��"+x+"���µĵ�"+y+"����Ҫ�ϰ�");
			}
		}
		for(int x=1;x<=5;x++){
					for(int y=1;y<=30;y++){
						//if(y%6==0)continue;
						//if(x==3 && y==20)break;

						System.out.println("��"+x+"���µĵ�"+y+"����Ҫ�ϰ�");
					}
		}
		a:for(int x=1;x<=5;x++){
			b:for(int y=1;y<=30;y++){
				if(x==3)break a;
					System.out.println("��"+x+"���µĵ�"+y+"����Ҫ�ϰ�");
					}
		}
	}
}