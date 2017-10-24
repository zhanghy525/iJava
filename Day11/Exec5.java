public class Exec5{
	public static void main(String[] args){
		String str = "etoakÒ×Í¾¿Æ¼¼666";

		char[] data = str.toCharArray();
		int countE = 0, countC = 0, countN = 0;

		for(char x :data){
			if(x > '0' && x <'9'){
				countN++;
			}else(x<127){
				countE++;
			}
		}
		System.out.println(""+ countN +""+ countE +""+ countC);
	}
}