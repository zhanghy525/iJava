public class Exec4{
	public static void main(String[] args){
		String str ="etoak濟南易途科技";
		System.out.println("漢字的格數是："+ (str.getBytes().length - str.length()));

		//②
		byte[] data = str.getBytes();
		int count = 0;
		for(byte x: data){
			if(x<0)count++;
		}
		System.out.println(count / 2);
	}
}