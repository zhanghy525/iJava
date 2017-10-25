public class Exec10{
	public static void main(String[] args){

		String str = "吃葡萄不吐葡萄皮,不吃葡萄倒吐葡萄皮";

		//split()
		//结尾会出问题,所以需要判断一下,或者追加一下
		String[] data = str.split("葡萄");

		int x1 = data.length-1;
		System.out.println(x1);

		//toCharArray()
		int count =0;
		char[] data2 = str.toCharArray();
		for(int x = 0;x<data2.length-2; x++){
			if(data2[x]=='葡'&&data2[x+1]=='萄'){
				count++;
			}
		}
		System.out.println(count);
		//indexOf()和lastIndexOf()
		int temp2 = 0;
		int count2 = 0;
		if(str.indexOf("葡萄")!= -1){
			//没有是0,有一个就进行比较
			for(int x = 1;x < str.length(); x++){
				String temp = str.substring(0,x);

				if(temp.indexOf("葡萄") != temp.lastIndexOf("葡萄")&&temp.lastIndexOf("葡萄")!=temp2){
					count2++;
					temp2=temp.lastIndexOf("葡萄");
				}
			}
		}
		//if(count>0)count2++;
		System.out.println(count2);

		//replace()1
		String data4 = str.replaceAll("葡萄","N");
		char[] temp4 = data4.toCharArray();
		int count3 = 0;
		for(char x: temp4){
			if(x=='N'){
				count3++;
			}
		}
		System.out.println(count3);

		//replace()2
		String data5 = str.replaceAll("葡萄","梨");
			char[] temp5 = data5.toCharArray();
			int count5 = str.length()-temp5.length;
		System.out.println(count5);

		while(str.contains("葡萄")){
			//每有一个葡萄,就替换第一个
			replaceFirst
		}

	}
}