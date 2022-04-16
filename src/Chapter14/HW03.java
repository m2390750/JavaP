package Chapter14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HW03 {
	public static void main(String args[])throws IOException
	{
//		int sum=0;
//		Scanner scn=new Scanner(System.in);
//		int n=scn.nextInt();
//		
//		for(int i=1;i<=n;i++)
//			sum+=i;
//		
//		System.out.print(sum);
		double n,sum=0;
		
		String str;
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("輸入一個整數:");
		str=buf.readLine();
		n=Integer.parseInt(str);
		
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println(sum);
	}
}
