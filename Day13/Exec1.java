public class Exec1{
	public static void main(String[] args){

		String str = "swiss";

		//charArray()和contains()①
		char[] temp1 = str.toCharArray();
		String temp2 = "";
		for(int x = 0;x<temp1.length-1;x++){
			String temp3 = temp1[x]+"";
			if(!temp2.contains(temp3)){
				//如果不包含该字符,加入新串
				temp2 = temp2 + temp1[x];
			}
		}
		System.out.println(temp2);

		//indexOf和lastIndexOf②
		//缺点:字符的位置会有问题,结合StringBuffer倒序处理以后会解决,或者用for先倒序


		//replace③
		//最好的方法,最常用的方法
		while(str.length()>0){
			String temp = str.charAt(0)+ "";
			System.out.print(temp);
			str = str.replace(temp,"");
		}
		System.out.println(temp);
		//split() 和equals()
	}
}