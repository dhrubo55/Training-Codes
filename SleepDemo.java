import java.util.Date;


public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Date d1;
		for(;;)
		{
			Thread.sleep(5000);
			d1 = new Date();
			System.out.println(d1.getHours()+": "+d1.getMinutes()+": "+d1.getSeconds());
		}
	}
}
