public class Exec2{
	public static void main(String[] args){

		String str = "��Ĭ����һ�£��������������|�����S����������������һ�ݸ��";

		String[] data = str.split("��");
		System.out.println(data.length);
		int count = 0;
		String stb = new String();

		for(String x : data){
			if(x.startsWith("��"))count++;
			if(x.length()>=4)
				System.out.println(x);
		}
		for(String x : data){
			if(x.contains("һ"))
				System.out.println(x);

		}
		System.out.println("�Տ��Ă����ǣ�"+count);

	}
}