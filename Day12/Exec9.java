public class Exec9{
	public static void main(String[] args){
		String str = "������66 ���ģ�82 ���壺73 �����S��90";

		String[] data = str.split(" ");

		String name = "����";

		for(String x : data){
			String temp = x.substring(0,x.indexOf("��"));
			if(name.equals(temp)){
				System.out.println(name+"�ķ֔���:"+x.substring(x.indexOf("��")+1));
			}
			//�࿼�]�����@������
			if(x.contains("������")){
				//...
			}
		}

		String z = str.substring(str.indexOf(name+"��")+name.length()+1,str.indexOf(name+"��")+name.length()+3);
		System.out.println(z);

	}
}