
import java.util.TimerTask;


public class MyTimeTask extends TimerTask {
	private String name;
	public MyTimeTask() {
		
	}
	public MyTimeTask(String input){
		name = input;
	}
	@Override
	public void run() {
		System.out.println("Current exec name is:" + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}