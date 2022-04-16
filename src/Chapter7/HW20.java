package Chapter7;

public class HW20 {
	public static void main(String args[])
	{
		double a;
		a=rpower(5,4);
		System.out.println(rpower(5,4));
		System.out.println(a);
	}
	
	public static double rpower(double b,int n)
	{
		double a=b;
	for(int i=1;i<=n;i++)
		b=b*a;
	
	return b;
	}
}
