public class Exec1{
	public static void main(String[] args){
		ϴ�»� n = new ϴ�»�();
		���� m = new ����();
		m.power(n);
	}
}
/**
���Ŵ����������е����Ͳ���֮��Ĺ�ϵ

	��ִ�����е�������ѭ:
		��������
		���ж��ѹ
		���е�������open()��close()����

		�ҵ�һ�����͵Ŀ�������淶:class �յ� ϴ�»�

		��һ��ͨ�緽��power()
*/

interface ����{
	String name = "����";
	int U = 220;

	void open();
	void close();
}

class ϴ�»� implements ����{

	public void open(){

	}

	public void close(){

	}
}

class ����{

	public void power(���� x){
		x.open();
		x.close();
	}

}