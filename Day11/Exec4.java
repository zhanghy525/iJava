public class Exec4{
	public static void main(String[] args){
		String str ="etoak������;�Ƽ�";
		System.out.println("�h�ֵĸ��ǣ�"+ (str.getBytes().length - str.length()));

		//��
		byte[] data = str.getBytes();
		int count = 0;
		for(byte x: data){
			if(x<0)count++;
		}
		System.out.println(count / 2);
	}
}