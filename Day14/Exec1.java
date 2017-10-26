public class Exec1{
	public static void main(String[] args){
		洗衣机 n = new 洗衣机();
		插座 m = new 插座();
		m.power(n);
	}
}
/**
拿着代码描述所有电器和插座之间的关系

	先执行所有电器都遵循:
		都有名字
		都有额定电压
		所有电器都有open()和close()方法

		找到一个类型的开发满足规范:class 空调 洗衣机

		有一个通电方法power()
*/

interface 电器{
	String name = "电器";
	int U = 220;

	void open();
	void close();
}

class 洗衣机 implements 电器{

	public void open(){

	}

	public void close(){

	}
}

class 插座{

	public void power(电器 x){
		x.open();
		x.close();
	}

}