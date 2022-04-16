package Chapter7;

public class HW24 {
	public static void main(String args[])
	{
		System.out.println(area(6,3));
		System.out.println(area(4.2f,3.3f));
		
		System.out.println(max(8,2));
		System.out.println(max(1,5,9));
	}
	public static float area(float base,float height)
	{
		float area;
		area=(base*height)/2;
		return area;
	}
	
	public static int max(int a,int b,int c)
	{
		if(b>a&&b>c)
			return b;
		else if(a>b&&a>c)
			return a;
		else
			return c;
		
	}
	public static int max(int a,int b)
	{
		if(b>a)
			return b;
		else
			return a;
	}

}
