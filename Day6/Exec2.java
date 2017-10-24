public class Exec2{
	public static void main(String[] args){
		String x = getColor(3);
		System.out.println(x);
	}
	/*
	public static String getColor(int number) {
		if(number == 1) return "1號球黃色";
		else if(number == 2)
		return "2號球紅色";
		else
		return "3號球紫色";
	}
	*/
	public static String getColor(int number) {
		switch(number) {
			case 1: ;return "一號球黃色";
			case 2: ;return "二號球黃色";
			case 3: ;return "三號球黃色";
			default:;return "參數錯誤";
		}
	}

}
