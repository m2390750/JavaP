package Chapter7;

public class HW26 {
	public static void main(String args[])
	{
		System.out.println(abs(-6));
		System.out.println(abs(-3.5f));
		System.out.println(abs(-2.12345));
		
		System.out.println(circle(2));
		System.out.println(circle(2.3));
		System.out.println(circle(2.3f));
	}
	public static int abs(int a)
	{
		if(a>0)
			return a;
		else
			return -a;
	}
	public static float abs(float a)
	{
		if(a>0)
			return a;
		else
			return -a;
	}
	public static double abs(double a)
	{
		if(a>0)
			return a;
		else
			return -a;
	}
	public static double circle(int a)
	{
		return (double)3.14*a*a;
	}
	public static double circle(double a)
	{
		return (double)3.14*a*a;
	}
	public static double circle(float a)
	{
		return (double)3.14*a*a;
	}
}
