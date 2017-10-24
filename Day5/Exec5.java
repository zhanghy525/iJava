public class Exec5{
	public static void main(String[] args){
		witchs(5);
		witchs(6);
	}
	static void witchs(int x) {
		System.out.println((( x & 1) == 0 ? "Å¼Êý" :"ÆæÊý") + x);
	}
}