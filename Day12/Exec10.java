public class Exec10{
	public static void main(String[] args){

		String str = "Ётфоля╡╩мбфоляф╓,╡╩Ётфоля╣╧мбфоляф╓";

		//split()
		String[] data = str.split("фоля");
		int x1 = data.length-1;
		System.out.print(x1);

		//toCharArray()
		int count =0;
		char[] data2 = str.toCharArray();
		for(int x = 0;x<data2.length-2; x++){
			if(data2[x]=='фо'&&data2[x+1]=='ля'){
				count++;
			}
		}
		System.out.println(count);
		//indexOf()╨мlastIndexOf()
		int temp2 = 0;
		int count2 = 0;
		for(int x = 1;x < str.length(); x++){
			String temp = str.substring(0,x);

			if(temp.indexOf("фоля") != temp.lastIndexOf("фоля")&&temp.lastIndexOf("фоля")!=temp2){
				count2++;
				temp2=temp.lastIndexOf("фоля");
			}
		}
		if(count>0)count++;
		System.out.println(count2);

		//replace()1
		String data4 = str.replaceAll("фоля","N");
		char[] temp4 = data4.toCharArray();
		int count3 = 0;
		for(char x: temp4){
			if(x=='N'){
				count3++;
			}
		}
		System.out.println(count3);

		//replace()2

	}
}