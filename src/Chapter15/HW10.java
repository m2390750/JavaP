package Chapter15;

class Add1 extends Thread implements Runnable
{
	private int n;
	private int sum=0;
	public Add1(int a)
	{
		n=a;
	}
	public void run()
	{
		for(int i=1;i<=n;i++)
		{	sum+=i;
		
		try {
		sleep((int)(2000*Math.random()));}
		catch(InterruptedException e) {}}
		System.out.println(sum);
	}
}
public class HW10 {
	public static void main(String args[])
	{
		Add1 a=new Add1(10);
		Add1 b=new Add1(5);
		
		Thread A=new Thread(a);
		Thread B=new Thread(b);
		A.start();
		B.start();
	}
}
