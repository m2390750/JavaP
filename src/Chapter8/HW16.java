package Chapter8;

class CSphere
{
	private int x;
	private int y;
	private int z;
	private int radius;
	
	void CSphere(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	public CSphere(int r)
	{
		radius=r;
	}
	void setRadius(int a)
	{
		radius=a;
	}
	double surfaceArea()
	{
		return 2*(4*3.14*radius*radius);
	}
	double volume()
	{
		return 4/3*3.14*radius*radius*radius;
	}
	public void showCenter()
	{
		System.out.println("¶ê¤ß®y¼Ð¬°:"+x+","+y+","+z);
	}
}
public class HW16 {
	public static void main(String args[]) 
	{
		CSphere cir=new CSphere(2);
		cir.CSphere(3,4,5);
		//cir.setRadius(2);
		System.out.println(cir.surfaceArea());
		System.out.println(cir.volume());
		cir.showCenter();
	}
}
