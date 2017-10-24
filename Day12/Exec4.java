public class Exec4{
	public static void main(String[] args){

		String[] data = {"Animal","Dog","Cat","Bird"};

		String temp = data[0];

		for(int x = 0; x < data.length-1;x++){
			for(int y = 0; y < data.length-1-x;y++){

				if(data[y].charAt(0) > data[y+1].charAt(0)){
					temp = data[y];
					data[y]=data[y+1];
					data[y+1]=temp;
				}
			}
		}

		for(String x: data){
			System.out.println(x);
		}
	}
}