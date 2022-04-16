package Chapter13;
import java.io.*;
import java.util.Scanner;

class IntegerTooSmall extends Exception
{	
	public String toString()	
	{
		return "��J����ƤӤp";
	}
}
class IntegerTooLarge extends Exception
{
	public String toString()	
	{
		return "��J����ƤӤj";
	}
}
class InputMismatchException extends Exception
{
	public String toString()	
	{
		return "��J����Ƥ��b�d��";
	}
}

public class HW14 {
	public static void main(String args[])throws IOException
	{
		try
		{
			String num;
			double num1;
			BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input a number:");
			num=buf.readLine();	
			num1=Double.parseDouble(num);
			
			if(num1%1!=0)
				throw new InputMismatchException();
			else if(num1>70)
				throw new IntegerTooLarge();
			else if(num1<10)
				throw new IntegerTooSmall();
			else
				System.out.println(num1);
		}
		catch(IntegerTooSmall e)
		{System.out.println(e);}
		catch(IntegerTooLarge e)
		{System.out.println(e);}
		catch(InputMismatchException e)
		{System.out.println(e);}
				
	}
}
