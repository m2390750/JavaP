package Chapter13;
import java.util.*;
import java.io.*;
public class App13_03 {
	public static void main (String args[])throws IOException 
	{
		int num = 0;
		Scanner scn=new Scanner(System.in);
		
		try {System.out.print("�п�J�@�Ӿ��: ");
		num=scn.nextInt();}
		catch(Exception e)
		{System.out.println("�ߥX"+e+"�ҥ~");}
		
		System.out.print(num);
	}
}
