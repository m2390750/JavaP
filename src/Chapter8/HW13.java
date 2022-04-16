package Chapter8;
class CCircle2
{
	double pi=3.14;
	double area(double r)
	{
		return 2*pi*r;
	}
	float area(float r)
	{
		return 2*(float)pi*r;
	}
	double area (int r)
	{
		return 2*pi*r;
	}
}
public class HW13 {
	public static void main(String args[])
	{
		CCircle2 cir = new CCircle2();
		System.out.println(cir.area(2));
		System.out.println(cir.area(2.2f));
		System.out.println(cir.area(2.2));
	}
}
