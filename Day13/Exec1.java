public class Exec1{
	public static void main(String[] args){

		String str = "swiss";

		//charArray()��contains()��
		char[] temp1 = str.toCharArray();
		String temp2 = "";
		for(int x = 0;x<temp1.length-1;x++){
			String temp3 = temp1[x]+"";
			if(!temp2.contains(temp3)){
				//������������ַ�,�����´�
				temp2 = temp2 + temp1[x];
			}
		}
		System.out.println(temp2);

		//indexOf��lastIndexOf��
		//ȱ��:�ַ���λ�û�������,���StringBuffer�������Ժ����,������for�ȵ���


		//replace��
		//��õķ���,��õķ���
		while(str.length()>0){
			String temp = str.charAt(0)+ "";
			System.out.print(temp);
			str = str.replace(temp,"");
		}
		System.out.println(temp);
		//split() ��equals()
	}
}