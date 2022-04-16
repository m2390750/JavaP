package Chapter9;
class CCircle
{
	private String color;
	private double pi=3.14;
	private double radius;
	
	public CCircle()
	{
		this("Green",1.0);
		System.out.println("constructor CCircle() called");
	}
	public CCircle(String str,double r)
	{
		System.out.println("constructor CCircle(String,double) called");
		color=str;
		radius=r;
	}
	public void show()
	{	
		System.out.println("color="+color+", Radius="+radius);
		System.out.println("area"+pi*radius*radius);
	}
	
}
public class APP9_1 {
	public static void main(String args[])
	{
		CCircle cir1=new CCircle();
		cir1.show();
	}
}
