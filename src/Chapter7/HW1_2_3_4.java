package Chapter7;

public class HW1_2_3_4 {
	public static void main(String args[]) 
	{
		kitty();
		kitty(8);
		System.out.println(cub(2));
		System.out.println(addto(10));
	}
	public static void kitty()
	{
		System.out.println("Hello Kitty");
	}
	public static void kitty(int k)
	{
		System.out.println("Hello Kitty");
	}
	public static int cub(int x)
	{
	 return x*x*x;
	}
	public static int addto(int n)
	{
		if(n==0)
		return 0;
		
		else
		return n+addto(n-1);	
	}
}
