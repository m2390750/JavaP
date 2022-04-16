package Chapter11;

interface Math2
{
	void show();
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
interface AdvancedMath
{
	public void mod(int a,int b);
	public void fac(int a);
	public void pow(int a,int b);
}
class Compute2 implements Math2,AdvancedMath
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
		ans=a/b;
	}
	public void show()
	{
		System.out.println(ans);
	}	
	public void mod(int a,int b)
	{
		ans=a%b;
	}
	public void fac(int a)
	{
		for(int i=(a-1);i>0;i--)
			a*=i;
		
		ans=a;
	}
	public void pow(int a,int b)
	{
		while(b>1)
			{a*=a;b--;}
		ans=a;
	}
}

public class HW09 {
	public static void main(String args[])
	{
		Compute2 cmp=new Compute2();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
		cmp.pow(3,3);
		cmp.show();
	}
}
