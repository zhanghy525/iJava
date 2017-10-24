public class Exec6{
	static Student[] data = new Student[4];
	public static void main(String[] args){

		Student stu1 = new Student();
		stu1.name = "王剛美";
		stu1.age = 18;
		stu1.gender ='男';
		stu1.score = 88;//-14=74

		Student stu2 = new Student();
		stu2.name = "王麗麗";
		stu2.age = 20;
		stu2.gender ='女';
		stu2.score = 93;//74

		Student stu3 = new Student();
		stu3.name = "趙翠花";
		stu3.age = 22;
		stu3.gender ='男';
		stu3.score = 51;//74

		Student stu4 = new Student();
		stu4.name = "白石";
		stu4.age = 20;
		stu4.gender ='男';
		stu4.score = 66;//74

		data[0] = stu1;
		data[1] = stu2;
		data[2] = stu3;
		data[3] = stu4;

		//得到全班的總分
		delate(1);

	}

	public static int show() {
		//顯示全班所有人的分數
		int sum = 0;
		for(Student stu : data){
			sum += stu.score;
		}
		return sum;
	}

	//打印XXX同學>平均分多少分
	public static void show2() {
		int sum  = show();
		int avg = sum / data.length;
		for(Student stu : data){
			if(stu.score>avg){
				System.out.println(stu.name+"高于平均分"+(stu.score-avg)+"分");
			}
		}
	}
	//封裝方法 用來以表的形式顯示内容
	public static void show3(){
		System.out.println("編碼"+"\t"+"姓名"+"\t"+"性別"+"\t"+"年齡"+"\t"+"分數");
		for(int x=0;x<data.length;x++){
			System.out.println(x +"\t"+data[x].name+"\t"+data[x].gender+"\t"+data[x].age+"\t"+data[x].score);
		}
	}
	public static void show4(){
			//System.out.println("編碼"+"\t"+"姓名"+"\t"+"性別"+"\t"+"年齡"+"\t"+"分數");
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
			System.out.println("請重新輸入編號，編號的範圍是0-"+(data.length-1));
		}else{
			Student[] temp = new Student[data.length-1];//注意數據類型
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
			//方法2,真好
			//System.arraycopy(data,1,data,x-1,temp.length-x);
			//System.arraycopy(data,0,temp,0,temp.length);
			data=temp;//把新（堆内存）地址交給data，老數據會自動被回收
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
