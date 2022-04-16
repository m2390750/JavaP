package Chapter15;

class CTest extends Thread
{
	private String id;
	public CTest(String str)
	{
		id=str;
	}
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			for(double j=0;j<1000000000;j++);
			System.out.println(id+" is running..");
		}
	}
}
public class App15_1 {
	public static void main(String args[])
	{
		CTest dog = new CTest("doggy");
		CTest cat = new CTest("kitty");
		dog.start();
		cat.start();
	}
}
