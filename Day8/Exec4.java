public class Exec4{
	 public static void main(String[] args){
	 	int[] data = new int[]{140,95,66,120,130};
	 	int temp1,temp2;
	 	for(int x=1;x<data.length;x++){
			for(int y=0;y<data.length-x;y++){
				temp1=data[y];
				temp2=data[y+1];
				if(temp1<100){
					temp1=temp1*2;
				}
				if(temp2<100){
					temp2=temp2*2;
				}
				if(temp1>temp2){
					data[y]= data[y+1]^data[y];
					data[y+1]= data[y+1]^data[y];
					data[y]= data[y+1]^data[y];
				}
			}
		}
		for(int x:data){
			System.out.print(x+"\t");
		}
	 }
}