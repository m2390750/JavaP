//1622185
//1622697
//1622441
//1624489
//1605545
package Chapter5;
import java.util.Scanner;

public class HW4 {
	public static void main(String args[]) 
	{
		Scanner Scan=new Scanner(System.in);
		char a=Scan.next().charAt(0);
		if(a>=65 && a<=90)
			System.out.println("�A��J���j�g�r��");
		
		else if(a>=97 && a<=122)
			System.out.println("�A��J���p�g�r��");
		
		else if(a>=48 && a<=57)
			System.out.println("�A��J���Ʀr");
		
		else
			System.out.println("����");
	}

}
