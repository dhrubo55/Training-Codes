
public class MyThread1 implements Runnable{

	Thread t1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t1 = Thread.currentThread();
		
		System.out.println("Child thread group is "+Thread.currentThread().getThreadGroup().getName());
		for (int i = 0; i < 20; i++) {
			System.out.println(i+"  "+t1.getName()+" child thread is running");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main thread is running");
		
		System.out.println();
		System.out.println("Main thread group is "+Thread.currentThread().getThreadGroup().getName());
		
		
		ThreadGroup tgr = new ThreadGroup("A group");
		tgr.isDaemon();
		
		Thread t = new Thread(new MyThread1());
		//t.setDaemon(true);
		t.start();
	}
}
