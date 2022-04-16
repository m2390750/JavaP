package Chapter15;

class Add implements Runnable
{
	private int n;
	private int sum=0;
	public Add(int a)
	{
		n=a;
	}
	public void run()
	{
		for(int i=1;i<=n;i++)
			sum+=i;
		
		System.out.println(sum);
	}
}
public class HW06 {
	public static void main(String args[])
	{
		Add a=new Add(10);
		Add b=new Add(5);
		
		Thread A=new Thread(a);
		Thread B=new Thread(b);
		A.start();
		B.start();
	}
}
