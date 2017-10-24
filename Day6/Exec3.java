public class Exec3 {
	public static void main(String[] args) {
		doSth("星期二");
		doSth("星期八");
	}
	public static void doSth(String day) {
		switch(day){
			case "星期一":
			case "星期五":
			case "星期六": System.out.println("逛街");break;
			case "星期二":
			case "星期四": System.out.println("看電影");break;
			case "星期三":
			case "星期七": System.out.println("開例會");break;
			default : System.out.println("上帝說沒有這一天");
		}
	}
}