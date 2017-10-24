public class Exec7{
	public static void main(String[] args){

		String str = "濟南今天氣溫:5℃ - 16℃";

		String[] data = str.split("今天");
		//String[] data2 = data[0].split("℃");
		//String s = data2[0].substring(data2[0].indexOf(":")+1);
		//String z = s;
		String s = str.substring(str.indexOf(":")+1,str.indexOf("℃"));
		String z = str.substring(str.lastIndexOf(" ")+1,str.lastIndexOf("℃"));

		//動態截取的黃金搭檔：indexOf lastIndexOf substring

		System.out.println(data[0]+ s +z);

	}
}