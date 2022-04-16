package Chapter13;

public class HW01 {
	public static void main(String args[])
	{
		
		try {
			int num=12,den=2 
					                    ;int ans=num/den;
		if(den==0)
			System.out.println("°£¼Æ¬°0");
		else                  
			System.out.println(num/den );}
		catch(ArithmeticException e)
			{System.out.println(e);}
			
		finally {System.out.println("end of main()!!");}                       
	}
}
