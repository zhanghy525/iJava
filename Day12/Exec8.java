public class Exec8{
	public static void main(String[] args){
		String str = "370872200106235811";

		String by = str.substring(6,10);

		String bm = str.substring(10,14);

		String gender = (str.charAt(16) & 1)==1 ? "男士":"女士";

		System.out.println("這位"+gender+" 出生年份是"+by+"生日是"+bm);
		/*
		String gender = str.substring(16,17);
		if("02468".contains(gender)){
			//true
		}else{
			//false
		}

		*/

		/*
			String gender = str.substring(16,17);
			if("02468".contains(gender)){
				//true
			}else{
				//false
			}

		*/
	}
}