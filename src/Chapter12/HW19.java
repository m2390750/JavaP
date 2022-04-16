package Chapter12;

import java.math.*;

public class HW19
{
	public static void main(String args[])
	{
	BigInteger a=fib(60);
	System.out.println(a);
	}
	public static BigInteger fib(int n)
		{
			BigInteger num;
			
			if(n==1||n==2)
			return BigInteger.valueOf(1);
		
			else
			{
			num=fib(n-1);
			return (num.add(fib(n-2)));
			}
		}
	
}
