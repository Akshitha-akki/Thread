package Thread_;

class Sync1
{
	void Print(int n)
	{
		System.out.println(n);
	}
}

class S
{
	Sync1 s;
	S(Sync1 s) 
	{
		this.s=s;
	}
	public void run()
	{
		s.Print(2);
	}
}
public class Sync2 
{
	public static void main(String[] args) 
	{
	}
}
