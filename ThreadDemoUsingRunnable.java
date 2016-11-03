
class Taskk1 implements Runnable
{
	String s;
   public Taskk1(String s)
   {
	   this.s = s;
   }
   
   @Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(i+" "+s+" "+Thread.currentThread().getName());
		}
	}
}

class Taskk2 implements Runnable
{
	String s;
   public Taskk2(String s)
   {
	   this.s = s;
   }
   
   @Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(i+" "+s+" "+Thread.currentThread().getName());
		}
	}
}

class Taskk3 implements Runnable
{
	String s;
   public Taskk3(String s)
   {
	   this.s = s;
   }
   
   @Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(i+" "+s+" "+Thread.currentThread().getName());
		}
	}
}

public class ThreadDemoUsingRunnable implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread called");
		System.out.println(this);
	}

	public static void main(String[] args) {
		Taskk1 t1 = new Taskk1("=");
		Taskk2 t2 = new Taskk2("*");
		Taskk3 t3 = new Taskk3("+");
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th3.setPriority(10);
		th1.start();
		th2.start();
		th3.start();
	}
}
