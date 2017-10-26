public class Exec5{
	public static void main(String[] args){
		Ball b1 = new Ball(4);
		System.out.println(b1);
	}
}

class Ball{
	int number;

	public Ball(int number){
		this.number = number;
	}

	public String toString(){

		String s = "»ÆÂÌºì°×»ÒºÚ×ÏÇà";

		if(1<=number&&number <= color.length())
			return s.charAt(number-1)+"";
		return "Ã»ÓÐÕâ¸öºÅÂëµÄÇò";

	}
}
