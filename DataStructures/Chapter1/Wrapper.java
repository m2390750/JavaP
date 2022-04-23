package Chapter1;

public class Wrapper {
	
	public static void main(String args[])
	{
		int j=8;
		Integer a=new Integer(12);
		int k=a;
		int m=j+a;
		a=3*m;
		Integer b=new Integer("-135");
		int n = Integer.parseInt("2013");
		
		
		System.out.println(a);//60
		System.out.println(k);//12
		System.out.println(m);//20
		System.out.println(b+n);//1878
		System.out.println(a.intValue());
		
		String u="Value= "+4.5;
		System.out.println(u);
		
		System.out.println(abs(10));
		System.out.println(abs(-10));
		
		
	}
	public static double abs(double a) {
		
		if(a<0)
			return -a;
		return a;
	}	
	
}
