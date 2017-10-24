public class Exec6{
	public static void main(String[] args){
		getAndSet("int","age");
		getAndSet("double","salary");

	}

	public static void getAndSet(String dataType,String dataName){
		String s0 = "public void setZZZZZ(XXXXX NNNNN){\n\tthis.NNNNN = NNNNN;\n}\npublic double getZZZZZ(){\n\treturn NNNNN;\n}";

		String upperDataName = dataName.substring(0,1).toUpperCase()+dataName.substring(1);
		s0=s0.replaceAll("ZZZZZ",upperDataName);
		s0=s0.replaceAll("NNNNN",dataName);
		s0=s0.replaceAll("XXXXX",dataType);
		System.out.println(s0);
	}
}