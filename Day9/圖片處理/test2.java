public class test2{
	public static void main(String[] args){
		Rect x = new Rect();
		x.steX(10);
		System.out.println(gteX());

	}
}
class Rect{
	static private int x;
	public void steX(int x){
		this.x =x;
	}
	public int gteX(){
		return x;
	}
}