package Chapter7;

public class HW19 {
	public static void main(String args[])
	{
		System.out.println(fib(50));
	}
	public static long fib(int n)
	{
//		if(n==1)
//			return 1;
//		else if(n==2)
//			return 1;
//		else
//		return fib(n-1)+fib(n-2);
		long f_1=1;
		long f_2=1;
		long f=1;
		for(int i=3;i<=n;i++)
		{
		f=f_1+f_2;
		f_2=f_1;
		f_1=f;
		}
		return f; 
		
	}

}
