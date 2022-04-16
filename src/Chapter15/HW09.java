package Chapter15;
class Test2 extends Thread implements Runnable
{
	private int id;
	private int sec;
	public Test2(int a,int b)
	{
		id=a;
		sec=b;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		try
		{
			sleep(sec);
			
		
		}
		catch(InterruptedException e) {}
		System.out.println("Thread"+id+" is running..");
		}
	}
}

public class HW09 {
	public static void main(String args[])
	{
		Test2 a=new Test2(1,1000);
		Test2 b=new Test2(2,2000);
		Thread A=new Thread(a);
		Thread B=new Thread(b);
		
		A.start();
		B.start();
		
	}
}
