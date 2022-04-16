package Chapter13;

public class HW07 {
	public static void main(String args[])throws ArithmeticException
	{
		
		
	try {test(12,0);}
	
	catch(ArithmeticException e)
		{System.out.println(e);}
			

		
			
		System.out.println("end of main()!!");            
	}
	public static void test(int a,int b)throws ArithmeticException
	{
		System.out.println(a/b);
	}
}


