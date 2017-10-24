//多態解除代碼耦合度時,作爲人傳參后，該方法是不是就不能用子類特有的屬性和方法了？是的
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