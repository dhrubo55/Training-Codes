class Task1 extends Thread
{
	String s;
   public Task1(String s)
   {
	   this.s = s;
   }
   
   @Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i+s+" "+getName());
		}
	}
}

class Task2 extends Thread
{
	String s;
   public Task2(String s)
   {
	   this.s = s;
   }
   
   @Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i+s+" "+getName());
		}
	}
}

class Task3 extends Thread
{
	String s;
   public Task3(String s)
   {
	   this.s = s;
   }
   
   @Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i+s+" "+getName());
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread t1 = new Task1("=");
		Thread t2 = new Task1("*");
		Thread t3 = new Task1("-");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
