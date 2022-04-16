package Chapter15;


class CTest2 implements Runnable
{
	private String id;
	private int sec;
	public CTest2(String n,int a)
	{
		id=n;
		sec=a;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<100000000;j++);
				System.out.println(id+" "+i);
			try {
			Thread.sleep(sec);}
			catch(InterruptedException e) {}
		}
	}
}
public class HW11 {
	public static void main(String args[])
	{
//		CTest2 a=new CTest2("dog");
//		CTest2 b=new CTest2("cat");
		
//		a.start();
//		b.start();
		
		CTest2 hi=new CTest2("Hello",1000);
		CTest2 bye=new CTest2("Good bye",2500);
		Thread HI=new Thread(hi);
		Thread BYE=new Thread(bye);
//		CTest2 morning=new CTest2("Good morning");
//		CTest2 night=new CTest2("Good night");
		HI.start();
		BYE.start();
//		morning.start(); 
//		night.start();
//		hi.run();
//		bye.run();
	}
}
	
