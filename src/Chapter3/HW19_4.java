package Chapter3;
import java.util.Scanner;

public class HW19_4 {
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt(),b=scan.nextInt();
		System.out.println(a+b);
		
		int c=scan.nextInt();
		System.out.println(3*c);
		
		int i=0;
		char d=scan.next().charAt(0);
		if (d>=65 && d<=90)
		{	
			i=d-64;
			System.out.println("這是第"+i+"個字母");
		}
		else if(d>=97 && d<=122)
		{	
			i=d-96;
			System.out.println("這是第"+i+"個字母");
		}
		else
			System.out.println("你輸入的不是英文");
	}
}
