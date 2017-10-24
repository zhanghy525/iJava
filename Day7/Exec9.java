public class Exec9{
	public static void main(String[] args){
		int[] panda = new int[19];
		panda[0]=1;panda[1]=1;
		for(int x=2;x<panda.length;x++){
			panda[x]=panda[x-2]+panda[x-1];
		}
		System.out.println(panda[panda.length-1]);
	}
}