package Thread_;

//Multiplication table for #Synchronnization
class MultiplicationTable
{
	synchronized void multiplicationTable(int n) 
	{
		 for(int i=1;i<=4;i++)
		 {
			 System.out.println(n+" * "+i+" = "+(n*i));//Printing of multiplication table 
		 }
		 try
		 {
			 Thread.sleep(500); //thread sleep time
		 }
		 catch (Exception e) {
			System.out.println(e);
		 }
	}
}
class MulTable1 extends Thread //first multiplication table and extending thread
{
	 MultiplicationTable m; // Object for MultiplicationTable class
	 MulTable1(MultiplicationTable m) //constructor method
	 {
		 this.m=m;
	 }
	 public void run()//run method
	 {
		 m.multiplicationTable(2); //method in the MultiplicationTable class 
	 }
}
class MulTable2 extends Thread // second multiplication table and extending thread
{
	 MultiplicationTable m;
	 MulTable2(MultiplicationTable m) 
	 {
		 this.m=m;
	 }
	 public void run()
	 {
		 m.multiplicationTable(3); //method in the MultiplicationTable class
	 }
}

public class Sync 
{
	public static void main(String[] args) 
	{
		MultiplicationTable obj =new MultiplicationTable(); //creating the obj for MultiplicationTable class
		MulTable1 m1 = new MulTable1(obj); 
		MulTable2 m2 = new MulTable2(obj);
		m1.start();//starting the thread of Multable1
		m2.start();//starting the thread of Multable2
	}
}
