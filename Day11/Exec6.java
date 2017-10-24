public class Exec6{
	public static void main(String[] args){
		String str = "劉德華，郭富城，黎明，張學友";
		//將名字是三個字的打印出來
		String[] data = str.split("，");
		for(String x: data){
			if(x.length() == 3){
				System.out.println(x);
			}
		}
	}
}