public class Exec3{
	public static void main(String[] args){

		String str = "g4y77y4r3u";

		char[] temp = str.toCharArray();

		String x = "",y = "";
		/*
		for(char z: temp){
			if('a'<= z && z<='z'){
				x += z;
			}
			if('0' <= z && z <= '9')
				y += z;
		}
		*/

		//replaceAll()支持正則表達式替換
		x = str.replaceAll("[0-9]","");
		y = str.replaceAll("[a-z]","");

		System.out.println(x);
		System.out.println(y);
	}
}