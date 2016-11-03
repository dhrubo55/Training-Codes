
class Account 
{
	static int x = 0;
	
}

class myAccount implements Runnable
{

	synchronized void increment()
	{
		System.out.println((Account.x++)+" ");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		increment();
		increment();
		increment();
		
	}
	
}

public class SynchronizationTest {

	public static void main(String[] args) {
		
		myAccount acc1 = new myAccount();
		Thread t1 = new Thread(acc1);
		Thread t2 = new Thread(acc1);
		Thread t3 = new Thread(acc1);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
