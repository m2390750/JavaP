package Chapter13;
import java.io.IOException;
import java.util.Scanner;

class Exception520 extends Exception
{
	public String toString()
	{
	return "這是由520引起的例外";
	}
}
public class HW13 {
	public static void main(String args[])throws Exception520 
	{
		Scanner scn=new Scanner(System.in);
				
		int num = 0;
		
		System.out.print("請輸入任何東西:");
		try {
			num=scn.nextInt();
			if(num==520)
				throw new Exception520();
			else
				System.out.println(num);
			}
	
			catch(Exception520 e)
			{System.out.println(e);}
	}	

}
