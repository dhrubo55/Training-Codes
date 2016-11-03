class Thread1 extends Thread
{
	public static final Object res1 = "printer", res2 = "keyboard";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		synchronized (res1) {
			System.out.println(getName()+" Has "+res2);
			synchronized (res2) {
				System.out.println(getName()+" Waiting for "+res1);
			}
		}
	}
}


class Thread2 extends Thread
{
	public static final Object res1 = "printer", res2 = "keyboard";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		synchronized (Thread1.res1) {
			System.out.println(getName()+" Has "+Thread1.res2);
			synchronized (Thread1.res2) {
				System.out.println(getName()+" Waiting for "+Thread1.res1);
			}
		}
	}
}


public class DeadLockDemo {
	
	public static void main(String[] args) {
		
	}
}
