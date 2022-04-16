package Chapter7;

public class HW21 {
	public static void main(String args[])
	{
	int a;
	a=sum(10);
	System.out.println(a);
	}
	
	public static int sum(int n)
	{
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		sum+=i;
//		
//		return sum;
		
		if(n==1)
			return 1;
		else
			return n+sum(n-1);
	}
}
