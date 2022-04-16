package Chapter15;

class CTest1 extends Thread
{
	private String id;
	public CTest1(String n)
	{
		id=n;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<100000000;j++);
				System.out.println(id+" "+i);
		}
	}
}
public class HW02 {
	public static void main(String args[])
	{
		CTest1 a=new CTest1("dog");
		CTest1 b=new CTest1("cat");
		
//		a.start();
//		b.start();
		
		CTest1 hi=new CTest1("Hello");
		CTest1 bye=new CTest1("Good bye");
		CTest1 morning=new CTest1("Good morning");
		CTest1 night=new CTest1("Good night");
		hi.start();
		bye.start();
		morning.start();
		night.start();
//		hi.run();
//		bye.run();
	}
}
	