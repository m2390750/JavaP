package Chapter9;
class CCircle4
{
	private static double pi=3.14;
	public double radius;
	
	public CCircle4(double r)
	{
		radius=r;
	}
	
	
}
public class HW9_9 {
	public static void main(String args[])
	{
		
		
		CCircle4 cir1 = new CCircle4(1.0);
		CCircle4 cir2 = new CCircle4(2.0);
		CCircle4 obj;
		
		
		obj=compare(cir1,cir2);
		if(cir1==obj)
			System.out.println("radius of cir1 is larger");
		else
			System.out.println("radius of cir2 is larger");
	}
	public static CCircle4 compare(CCircle4 cir1,CCircle4 cir2)
	{
		if(cir1.radius>cir2.radius)
			return cir1;
		else
			return cir2;
	}

}
