public class Exec10{
	public static void main(String[] args){

		String str = "�����Ѳ�������Ƥ,�������ѵ�������Ƥ";

		//split()
		//��β�������,������Ҫ�ж�һ��,����׷��һ��
		String[] data = str.split("����");

		int x1 = data.length-1;
		System.out.println(x1);

		//toCharArray()
		int count =0;
		char[] data2 = str.toCharArray();
		for(int x = 0;x<data2.length-2; x++){
			if(data2[x]=='��'&&data2[x+1]=='��'){
				count++;
			}
		}
		System.out.println(count);
		//indexOf()��lastIndexOf()
		int temp2 = 0;
		int count2 = 0;
		if(str.indexOf("����")!= -1){
			//û����0,��һ���ͽ��бȽ�
			for(int x = 1;x < str.length(); x++){
				String temp = str.substring(0,x);

				if(temp.indexOf("����") != temp.lastIndexOf("����")&&temp.lastIndexOf("����")!=temp2){
					count2++;
					temp2=temp.lastIndexOf("����");
				}
			}
		}
		//if(count>0)count2++;
		System.out.println(count2);

		//replace()1
		String data4 = str.replaceAll("����","N");
		char[] temp4 = data4.toCharArray();
		int count3 = 0;
		for(char x: temp4){
			if(x=='N'){
				count3++;
			}
		}
		System.out.println(count3);

		//replace()2
		String data5 = str.replaceAll("����","��");
			char[] temp5 = data5.toCharArray();
			int count5 = str.length()-temp5.length;
		System.out.println(count5);

		while(str.contains("����")){
			//ÿ��һ������,���滻��һ��
			replaceFirst
		}

	}
}