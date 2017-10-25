
import java.util.Timer;

public class MyTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTimeTask myTimerTask = new MyTimeTask("z");
		timer.schedule(myTimerTask, 1000L, 1000L);
	}
}
