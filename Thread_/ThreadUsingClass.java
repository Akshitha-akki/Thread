package Thread_;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Welcome to Threads");
	}
}

public class ThreadUsingClass {

	public static void main(String[] args) {
	 Thread1 t=new Thread1();
	 t.start();
	}
}
