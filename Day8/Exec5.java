public class Exec5{
	public static void main(String[] args){
		char[] data = new char[]{'D','c','a','B','C','A','b','d'};
		//97-65=32;
		//∑÷ΩÁ «90-96
		//åç¨FA<a<B<b<C<c<D<d

		double temp,temp2;
		char temp3;
		for(int x=1;x<data.length;x++){
			for(int y=0;y<data.length-x;y++){
				temp=data[y]<92 ? data[y]+31.5:data[y];
				temp2=data[y+1]<92 ? data[y+1]+31.5:data[y+1];
				if(temp>temp2){
					 temp3=data[y];
					 data[y]=data[y+1];
					 data[y+1]=temp3;
				}
			}
		}
		for(char x:data){
			System.out.print(x+"\t");
		}
	}
}