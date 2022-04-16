package Chapter13;



public class HW08 {
	public static void main(String args[])
	{
		
		
	try {Ctest.test(12,0);}
	
	catch(ArithmeticException e)
		{System.out.println(e);}
				
		System.out.println("end of main()!!");}
	}
	
	class Ctest{
		public static void test(int a,int b)throws ArithmeticException
		{System.out.println(a/b);}}
	
	
