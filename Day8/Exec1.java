public class Exec1{
	public static void main(String[] args){
		int[] data = new int[]{45,66,82,17,99,30};
		int[] data2 = new int[data.length-1];
		System.arraycopy(data,0,data2,0,2);
		System.arraycopy(data,3,data2,2,3);
		for(int x: data2)
			System.out.print(x+" ");
		System.out.println();
		//≤ª”√data2
		System.arraycopy(data,3,data,2,3);
		int[] data3 = new int[data.length-1];
		System.arraycopy(data,0,data3,0,data.length-1);
		for(int x: data3)
			System.out.print(x+" ");
		System.out.println();
	}

}