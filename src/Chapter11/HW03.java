package Chapter11;

interface Math1
{
	public void show();
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
class Compute1 implements Math1
{	
	protected int a,b;
	protected double ans;
	public void add(int a,int b)
	{
		ans=a+b;
	}
	public void sub(int a,int b)
	{
		ans=a-b;
	}
	public void mul(int a,int b)
	{
		ans=a*b;
	}
	public void div(int a,int b)
	{
		ans=a/b;
	}
	public void show()
	{
		System.out.println(ans);
	}	
}
public class HW03 {
	public static void main(String args[])
	{
	Compute1 cmp=new Compute1();
	cmp.mul(3,5);
	cmp.show();
	}
	
}

