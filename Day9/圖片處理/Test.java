import java.awt.Robot;
import java.awt.Color;
import java.io.File;

public class Test{
	public static void main(String[] args) throws Exception{

		Robot robot = new Robot();

		Color color= robot.getPixelColor(1,1);
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());
		createTempFile("aaa",".jpg",null);
	}
}