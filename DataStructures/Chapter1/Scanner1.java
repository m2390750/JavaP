package Chapter1;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String args[])
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an integer: ");
//		System.out.println('a');
		while(!input.hasNextInt())
		{
			input.nextLine();//¥Înext
			System.out.print("Invalid integer; please enter an integer: ");
		}
		int i=input.nextInt();
		System.out.println(i);
	}
}
