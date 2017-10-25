public class Exec2{
	public static void main(String[] args){

		String str = "god";
		str = str.toUpperCase();
		//toCharArray();¢Ù
		char[] temp2 = str.toCharArray();
		String temp3 = "";
		for(int x = 0;x<temp2.length;x++){
			temp3=temp2[x] + temp3;
		}
		System.out.println(temp3);
		//charAt(),length();¢Ú

		String temp = "";
		/*
		for(int x = str.length()-1;x>=0;x--){
			temp = temp+str.charAt(x);
		}
		*/
		for(int x = 0;x<str.length();x++){
			temp =str.charAt(x) + temp;
		}
		System.out.println(temp);

		//StringBuffer¢Û
		StringBuffer str3 = new StringBuffer();
		for(int x =0; x<str.length();x++){
			str3 = str3.insert(0,str.charAt(x));
		}
		System.out.println(str3);
	}
}