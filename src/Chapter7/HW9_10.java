package Chapter7;

public class HW9_10 {
	public static void main(String args[])
	{
		System.out.println(abs(-5));
		System.out.println(abs(2));
		System.out.println(abs(0));
		
		System.out.println(min(5,8)+"  "+min(9,2));
	}
	public static int abs(int x)
	{
		if (x>0)
			return x;
		
		else
			return -x;
	}
	public static int min(int a,int b)
	{
		if (a>b)
			return b;
		else
			return a;
	}
}
