package Chapter13;

import java.io.*;

class ArgumentOutOfBoundextends extends Exception
{
	public String tostring()
	{
		return "n小於0";
	}
}
public class HW15 {
	
	public static void main(String args[])
	{
		try {
		int n;
		String str1;
		BufferedReader str=new BufferedReader(new InputStreamReader(System.in));
		str1=str.readLine();
		n=Integer.parseInt(str1);
		mySqrt(n);}
		
		catch(IOException e)
		{}
		
	}
		static double ans;
	public static void mySqrt(int n)
	{ 
		try {
		if(n>0)
		{
			ans=Math.sqrt((double)n);
			System.out.println(ans);
			return;}
		if(n<0)
			throw new ArgumentOutOfBoundextends();}
		
		catch(ArgumentOutOfBoundextends e)
		{System.out.print("n小於0");}
	}
		
	
		
}
