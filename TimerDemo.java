import java.util.Timer;
import java.util.TimerTask;


public class TimerDemo extends TimerTask {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("THis is mail time");
	}

	public static void main(String[] args) {
		Timer t = new Timer();
		//t.schedule(new TimerDemo(), 1000*5);
		t.scheduleAtFixedRate(new TimerDemo(), 1000*5, 2000);
		System.out.println("Mail Task will start after 5 seconds");
	}
}
