
public class ThreadDemo1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread called");
		System.out.println(this);
	}

	public static void main(String[] args)  {
		System.out.println(Thread.currentThread());
		System.out.println("Main thread running");
		
		ThreadDemo1 demo1= new ThreadDemo1();
		demo1.setName("Task 1...");
		demo1.start();
		
	}
}
