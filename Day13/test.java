public class test{
	public static void main(String[] args){
		B b = new B(30);

	}
}

class B {
	int x;
	{
		x = 45;
		System.out.println("A");
	}

	public B(int x){
		this.x = x;
		System.out.println("B");
	}

}