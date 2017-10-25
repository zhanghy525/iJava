public class Exec1{
	public static void main(String[] args){
		String str = "jdk";
		str = str.toUpperCase();
		str = str.substring(1);

		String str2 = "test";
		//str2.replace("es","se");
		char[] x = str2.toCharArray();

		char temp = x[1];
		x[1] =  x[2];
		x[2] = temp;
		String str3 = new String(x);
		System.out.println(str3);
	}
}