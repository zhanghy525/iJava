public class Exec2{
	public static void main(String[] args) throws Exception{
		OS a = new OS("Apple");
		OS b = a.clone();//��Ҫ�׳��쳣
		System.out.println(a.toString());

	}
}
class OS implements Cloneable{//��¡�ӿ�,��������п�¡
	String name;
	public OS(String name){
		this.name = name;
	}
	@Override
	public OS clone() throws CloneNotSupportedException{//
		Object obj = super.clone();//��Ҫ�׳��쳣
		return (OS)obj;
	}
}
