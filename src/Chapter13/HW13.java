package Chapter13;
import java.io.IOException;
import java.util.Scanner;

class Exception520 extends Exception
{
	public String toString()
	{
	return "�o�O��520�ް_���ҥ~";
	}
}
public class HW13 {
	public static void main(String args[])throws Exception520 
	{
		Scanner scn=new Scanner(System.in);
				
		int num = 0;
		
		System.out.print("�п�J����F��:");
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
