package Chapter9;

class Power{
	
	public static void power(int x,int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
			sum*=x;
		System.out.println(x+"��"+n+"���謰: "+sum);
	}
}
public class HW9_7 {
	public static void main(String args[])
	{
		Power.power(2, 5);
		Power.power(3, 2);
	}
}
