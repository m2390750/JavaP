package Chapter9;

class CCircle3
{
	private static double pi=3.14;
	private double radius;
	
	public CCircle3(double r)
	{
		radius=r;
	}
	public void show()
	{
		System.out.println("area="+pi*radius*radius);
	}
}
public class HW9_15_16 {
	public static void main(String args[])
	{
		CCircle3 cir[];
		cir=new CCircle3[6];
		for(int i=0;i<6;i++)
		cir[i]=new CCircle3((double)i);
		
		for(int i=0;i<6;i++)
		cir[i].show();
		
	}
}
