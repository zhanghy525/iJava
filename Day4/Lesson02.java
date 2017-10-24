package yituday03;

public class Lesson02 {
	public static void main(String[] args) {
		/*
		 * + 是表示 是多少呢？
		 */
		System.out.println(1 + 1);//2
		System.out.println(1 + "1");//11
		System.out.println(1 + '1' + "1");//501
		System.out.println(1 + "1" + 1);//111
		System.out.println('1' + '1');//98
		System.out.println(1 + "1" + '1');//111

		// × 超過int邊界記得改成

		// ÷ 整數除以整數還是整數
		// 0不能做除數

		System.out.println(5 / 0.0);// Infinty
		System.out.println(0.0 / 0.0); // NaN
		//System.out.println(5 / 0); // 抱錯

		System.out.println(512 / 1024 * 100 + '%');//0%
		System.out.println(512 * 100 / 1024 + '%');//50%
		
		//%
		System.out.println(10 % 3); //1
		
		// += 自帶強轉BGM
		
		
		
		
		

	}
}
