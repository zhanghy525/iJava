public class Exec8{
	public static void main(String[] args){
		int[] data = new int[]{47,88,92,30,59,66};
		System.out.println(data.length);
		//
		for(int x : data)
			if(x<60)
				System.out.println(x);
		//
		for(int x=0;x<data.length;x++)
			if(data[x]<60)
				System.out.println(data[x]);
		//����
		int sum=0,count=0;
		for(int x=0;x<data.length;x++){
			sum +=data[x];
		}
		System.out.println("������"+sum);
		int avg =sum / data.length;
		for(int x: data){
			if(x>avg)
				count++;
		}
		System.out.println("����ƽ���ֵĂ���"+count);
		//
		int temp=0;
		for(int x=0;x<data.length;x++){
			for(int y=0;y<data.length;y++){
				if(data[x]>data[y]){
					temp=data[x];
					data[x]=data[y];
					data[y]=temp;
				}
			}
		}
		System.out.println("�ͣ�"+ data[data.length-1]+"�ߣ�"+data[0]);
		//�󔵽M�����ֵ����Сֵ���������Ô��M�Y�Ĕ�ֵ�M���xֵ
		int max=data[0],min=data[0];
		for(int x:data){
			if(x>max)max=x;
			if(x<min)min=x;
		}
		System.out.println(min+" "+max);
	}
}