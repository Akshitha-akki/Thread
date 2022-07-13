package Thread_;

class Thread2 implements Runnable {
	public void run() {
		System.out.println("Thread using interface");
	}
}
 
public class ThreadUsingInterface {

	public static void main(String[] args) 
	{
		Thread2 t=new Thread2();
		Thread t1=new Thread(t);
		t1.start();
	}

}
