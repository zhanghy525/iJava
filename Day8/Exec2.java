public class Exec2{
	public static void main(String[] args){
		int[] data =new int[]{45,66,19,83,90};
		for(int x =1;x<data.length;x++){
			for(int y=0;y<data.length-x;y++){  //減少了減一這一步運算
				if(data[y+1] > data[y]){
					data[y+1]= data[y] ^ data[y+1];
					data[y]= data[y] ^ data[y+1];
					data[y+1]= data[y] ^ data[y+1];
				}
			}
		}
		for(int x:data){
			System.out.println(x+" ");
		}
		System.out.println();
	}
}