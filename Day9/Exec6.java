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
		Student stu = new Student();
		stu.name =  "劉磊";
		stu.age = 17;
		stu.gender = '男';
		stu.score = 31;
		add(stu);
		show4();
		add(stu,3);


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

	public static void delate(int x){
		show3();
		//x=0;
		//x=1;
		//x=3
		if(x<0||x>=data.length){
			System.out.println("請重新輸入編號，編號的範圍是0-"+(data.length-1));
		}else{
			Student[] temp = new Student[data.length-1];//注意數據類型Student[]
			System.arraycopy(data,0,temp,0,x);
			System.arraycopy(data,x+1,temp,x,temp.length-x);
			//方法2,真好
			//System.arraycopy(data,1,data,x-1,temp.length-x);
			//System.arraycopy(data,0,temp,0,temp.length);
			data=temp;//把新（堆内存）地址交給data，老數據會自動被回收
			show3();
		}
	}

	//封裝一個方法，專門用來往數組裏面添加一個新學生
	public static void add(Student stu) {
		//創建一個新數組，長度+1
		Student[] temp = new Student[data.length+1];
		//老元素複製過來
		System.arraycopy(data,0,temp,0,data.length);
		//把它加到最後
		temp[data.length] = stu;
		//data.length = temp.length-1
		//更新data的地址,使temp消亡
		data=temp;
		//展示數組
		show3();
	}
	//添加新元素到指定位置
	public static void add(Student stu, int x){
		//檢查合法性
		if(x>=data.length||x<0){
			System.out.println("不合法");
		}else{
			//創建新容器
			Student[] temp = new Student[data.length+1];
			//複製老數組的第一部分
			System.arraycopy(data,0,temp,0,x);
			//插入新元素
			temp[x]=stu;
			//補齊後半部分
			System.arraycopy(data,x,temp,x+1,data.length-x);
			//消亡temp，改變data地址
			data=temp;
			//展示效果
			show3();
		}
	}


	//用來顯示最高分和最低分
	public static void show4() {
		//申請臨時空間
		int min = data[0].score;
		int max = data[0].score;
		for(int x =0;x<data.length;x++){
			//尋找最小值
			if(data[x].score < min){
				min = data[x].score;
			}
			//尋找最大值
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
