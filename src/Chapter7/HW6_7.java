package Chapter7;

public class HW6_7 {
	public static void main(String args[])
	{
		for (int i=1;i<=100;i++)
			if( even(i) && i%9==0)
				System.out.println(i);
	}
	public static boolean even(int n)
	{
		if(n%2==0)
			return true;
		
		else
			return false;
	}

}
