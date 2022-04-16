package Chapter7;

public class HW22 {
	public static void main(String args[])
	{
		System.out.println(sqrt(3,8));
		System.out.println(sqrt(7,4));
	}
	
	public static double sqrt(double a,double b)
	{
		if(b==0)
		 return 1;
		else if(b==1)
			return a;
		
		else
			return a*sqrt(a,b-1);
	}

}
