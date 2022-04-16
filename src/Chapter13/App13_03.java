package Chapter13;
import java.util.*;
import java.io.*;
public class App13_03 {
	public static void main (String args[])throws IOException 
	{
		int num = 0;
		Scanner scn=new Scanner(System.in);
		
		try {System.out.print("請輸入一個整數: ");
		num=scn.nextInt();}
		catch(Exception e)
		{System.out.println("拋出"+e+"例外");}
		
		System.out.print(num);
	}
}
