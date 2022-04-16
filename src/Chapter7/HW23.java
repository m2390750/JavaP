package Chapter7;

public class HW23 {
	public static void main(String args[])
	{
		System.out.println(rsum(5));
	}
	
	public static int rsum(int n)
	{
	if(n==1)
		return 0;
	
	else
		return n*(n-1)+rsum(n-1);
	}
}
