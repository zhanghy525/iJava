public class Exec2{
	public static void main(String[] args){

		String str = "張默，文一章，房祖名，柯正東西，黃海波波，張冠西，一休哥哥";

		String[] data = str.split("，");
		System.out.println(data.length);
		int count = 0;
		String stb = new String();

		for(String x : data){
			if(x.startsWith("張"))count++;
			if(x.length()>=4)
				System.out.println(x);
		}
		for(String x : data){
			if(x.contains("一"))
				System.out.println(x);

		}
		System.out.println("姓張的個數是："+count);

	}
}