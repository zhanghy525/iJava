public class Exec2{
	public static void main(String[] args) throws Exception{
		OS a = new OS("Apple");
		OS b = a.clone();//需要抛出异常
		System.out.println(a.toString());

	}
}
class OS implements Cloneable{//克隆接口,允许类进行克隆
	String name;
	public OS(String name){
		this.name = name;
	}
	@Override
	public OS clone() throws CloneNotSupportedException{//
		Object obj = super.clone();//需要抛出异常
		return (OS)obj;
	}
}
