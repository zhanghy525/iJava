public class Exec1{
	public static void main(String[] args){
		Product pro = new Product("Apple",100.0000,2.00001);
		pro.show();

	}
}
class Product{
	String name;
	private double jinJia;
	double shouJia;

	public Product(){

	}

	public Product(String name,double jinJia,double shouJia){
		this.name = name;
		//BigDecimal
		this.jinJia = (int)(jinJia * 100) / 100;
		this.shouJia = (int)(shouJia * 100) / 100;
	}

	public double getJinJia(){
		return jinJia;
	}
	public void setJinJia(double jinJia){
		this.jinJia = (int)(jinJia * 100) / 100;
	}

	public void show(){
		System.out.println(name +"\t"+ shouJia);
	}

}