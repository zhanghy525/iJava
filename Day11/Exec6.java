public class Exec6{
	public static void main(String[] args){
		String str = "�����A�������ǣ����������W��";
		//�������������ֵĴ�ӡ����
		String[] data = str.split("��");
		for(String x: data){
			if(x.length() == 3){
				System.out.println(x);
			}
		}
	}
}