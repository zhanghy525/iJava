public class Exec6{
	static Student[] data = new Student[4];
	public static void main(String[] args){

		Student stu1 = new Student();
		stu1.name = "������";
		stu1.age = 18;
		stu1.gender ='��';
		stu1.score = 88;//-14=74

		Student stu2 = new Student();
		stu2.name = "������";
		stu2.age = 20;
		stu2.gender ='Ů';
		stu2.score = 93;//74

		Student stu3 = new Student();
		stu3.name = "�w�仨";
		stu3.age = 22;
		stu3.gender ='��';
		stu3.score = 51;//74

		Student stu4 = new Student();
		stu4.name = "��ʯ";
		stu4.age = 20;
		stu4.gender ='��';
		stu4.score = 66;//74

		data[0] = stu1;
		data[1] = stu2;
		data[2] = stu3;
		data[3] = stu4;

		//�õ�ȫ��Ŀ���
		delate(1);

	}

	public static int show() {
		//�@ʾȫ�������˵ķ֔�
		int sum = 0;
		for(Student stu : data){
			sum += stu.score;
		}
		return sum;
	}

	//��ӡXXXͬ�W>ƽ���ֶ��ٷ�
	public static void show2() {
		int sum  = show();
		int avg = sum / data.length;
		for(Student stu : data){
			if(stu.score>avg){
				System.out.println(stu.name+"����ƽ����"+(stu.score-avg)+"��");
			}
		}
	}
	//���b���� �Á��Ա����ʽ�@ʾ����
	public static void show3(){
		System.out.println("���a"+"\t"+"����"+"\t"+"�Ԅe"+"\t"+"���g"+"\t"+"�֔�");
		for(int x=0;x<data.length;x++){
			System.out.println(x +"\t"+data[x].name+"\t"+data[x].gender+"\t"+data[x].age+"\t"+data[x].score);
		}
	}
	public static void show4(){
			//System.out.println("���a"+"\t"+"����"+"\t"+"�Ԅe"+"\t"+"���g"+"\t"+"�֔�");
			for(int x=0;x<data.length;){
				System.out.println(x++);
			}
	}

	public static void delate(int x){
		show3();
		//x=0;
		//x=1;
		//x=3
		if(x>=data.length){
			System.out.println("Ո����ݔ�뾎̖����̖�Ĺ�����0-"+(data.length-1));
		}else{
			Student[] temp = new Student[data.length-1];//ע�┵�����
			if(x==0){
				System.arraycopy(data,1,temp,0,data.length-1);
			}else if(x==data.length-1){
				System.arraycopy(data,0,temp,0,data.length-1);
			}else{
				//x=1
				System.arraycopy(data,0,temp,0,x);
				//0,0,1
				System.arraycopy(data,x+1,temp,x,temp.length-x);
				//2,1,2
			}
			//����2,���
			//System.arraycopy(data,1,data,x-1,temp.length-x);
			//System.arraycopy(data,0,temp,0,temp.length);
			data=temp;//���£����ڴ棩��ַ���odata���ϔ������Ԅӱ�����
			show3();
		}
	}
}
class Student{
	String name;
	int age;
	char gender;
	int score;

}
