public class Exec7{
	public static void main(String[] args){

		String str = "���Ͻ�����:5�� - 16��";

		String[] data = str.split("����");
		//String[] data2 = data[0].split("��");
		//String s = data2[0].substring(data2[0].indexOf(":")+1);
		//String z = s;
		String s = str.substring(str.indexOf(":")+1,str.indexOf("��"));
		String z = str.substring(str.lastIndexOf(" ")+1,str.lastIndexOf("��"));

		//�ӑB��ȡ���S���n��indexOf lastIndexOf substring

		System.out.println(data[0]+ s +z);

	}
}