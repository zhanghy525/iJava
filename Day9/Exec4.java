//���B������a��϶ȕr,�����˂�����ԓ�����ǲ��ǾͲ�����������еČ��Ժͷ����ˣ��ǵ�
public class Exec4{
	public static void main(String[] args){
		QQ q =new QQ();
		XiuCheChang x = new XiuCheChang();
		x.service(q);
	}
}
class XiuCheChang{
	public void service(Car x){
		System.out.println("Service");
	}
}
class Car{}
class QQ extends Car{
	int z=5;
}
class VV extends Car{

}
class BMW extends Car{
}