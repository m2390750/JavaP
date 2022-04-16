package Chapter11;

interface Show_ans
{
	public void show();
}

interface Math3 extends Show_ans
{
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}

class Compute4 implements Math3
{
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
		ans=(double)a/b;
	}
	public void show()
	{
		System.out.print(ans);
	}
}
public class HW13 {
		public static void main(String args[])
		{
			Compute4 cmp=new Compute4();
			cmp.mul(3, 5);
			cmp.show();
		}
}
