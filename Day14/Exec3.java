public class Exec3{
	public static void main(String[] args){
		Ball b1 = new Ball(7);
		//���÷���ֱ�Ӵ�ӡ���
		System.out.println(b1);
	}
}

class Ball {
	int number;

	public Ball(int number){
		this.number = number;
	}

	@Override
	public String toString(){
		return number + "";//String.valueOf()
	}
}