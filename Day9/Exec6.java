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
		Student stu = new Student();
		stu.name =  "����";
		stu.age = 17;
		stu.gender = '��';
		stu.score = 31;
		add(stu);
		show4();
		add(stu,3);


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

	public static void delate(int x){
		show3();
		//x=0;
		//x=1;
		//x=3
		if(x<0||x>=data.length){
			System.out.println("Ո����ݔ�뾎̖����̖�Ĺ�����0-"+(data.length-1));
		}else{
			Student[] temp = new Student[data.length-1];//ע�┵�����Student[]
			System.arraycopy(data,0,temp,0,x);
			System.arraycopy(data,x+1,temp,x,temp.length-x);
			//����2,���
			//System.arraycopy(data,1,data,x-1,temp.length-x);
			//System.arraycopy(data,0,temp,0,temp.length);
			data=temp;//���£����ڴ棩��ַ���odata���ϔ������Ԅӱ�����
			show3();
		}
	}

	//���bһ�����������T�Á������M�Y�����һ���W��
	public static void add(Student stu) {
		//����һ�����M���L��+1
		Student[] temp = new Student[data.length+1];
		//��Ԫ���}�u�^��
		System.arraycopy(data,0,temp,0,data.length);
		//�����ӵ�����
		temp[data.length] = stu;
		//data.length = temp.length-1
		//����data�ĵ�ַ,ʹtemp����
		data=temp;
		//չʾ���M
		show3();
	}
	//�����Ԫ�ص�ָ��λ��
	public static void add(Student stu, int x){
		//�z��Ϸ���
		if(x>=data.length||x<0){
			System.out.println("���Ϸ�");
		}else{
			//����������
			Student[] temp = new Student[data.length+1];
			//�}�u�ϔ��M�ĵ�һ����
			System.arraycopy(data,0,temp,0,x);
			//������Ԫ��
			temp[x]=stu;
			//�a�R��벿��
			System.arraycopy(data,x,temp,x+1,data.length-x);
			//����temp����׃data��ַ
			data=temp;
			//չʾЧ��
			show3();
		}
	}


	//�Á��@ʾ��߷ֺ���ͷ�
	public static void show4() {
		//��Ո�R�r���g
		int min = data[0].score;
		int max = data[0].score;
		for(int x =0;x<data.length;x++){
			//������Сֵ
			if(data[x].score < min){
				min = data[x].score;
			}
			//�������ֵ
			if(data[x].score > max){
				max = data[x].score;
			}
		}
		System.out.println("min"+"	"+"max");
		System.out.println(min+"	"+max);
	}

}
class Student{
	String name;
	int age;
	char gender;
	int score;

}
