public class Exec3{
	public static void main(String[] args){
		int[] data =new int[]{666,721,893,900,520};
		for(int x=1;x<data.length;x++){
			for(int y=0;y <data.length-x;y++){
				int temp1 = data[y]/100+data[y]/10%10+data[y]%10;
				int temp2 = data[y+1]/100+data[y+1]/10%10+data[y+1]%10;
				if(temp1 > temp2){
					data[y]=data[y+1]^data[y];
					data[y+1]=data[y+1]^data[y];
					data[y]=data[y+1]^data[y];
				}
			}
		}
		for(int x: data){
			System.out.print(x+"\t");
		}
		System.out.println();			 `
	}
}