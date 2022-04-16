package Chapter9;

class Add
{
	 public static void add2n(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println(sum);
	}
	
}
public class HW9_6 {
	public static void main(String args[])
	{
		Add.add2n(5);
		Add.add2n(10);
		
		
	}
}
