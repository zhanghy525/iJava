public class Exec9{
	public static void main(String[] args){
		String str = "張三：66 李四：82 王五：73 張三豐：90";

		String[] data = str.split(" ");

		String name = "張三";

		for(String x : data){
			String temp = x.substring(0,x.indexOf("："));
			if(name.equals(temp)){
				System.out.println(name+"的分數是:"+x.substring(x.indexOf("：")+1));
			}
			//多考慮包含這個方法
			if(x.contains("張三：")){
				//...
			}
		}

		String z = str.substring(str.indexOf(name+"：")+name.length()+1,str.indexOf(name+"：")+name.length()+3);
		System.out.println(z);

	}
}