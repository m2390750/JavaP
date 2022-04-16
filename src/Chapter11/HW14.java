package Chapter11;
interface iVolume
{
	public void showData();
	public double vol();
}
abstract class CSphere implements iVolume
{
	final double PI=3.14;
	protected int x;
	protected int y;
	protected int radius;
	public double vol()
	{
		return 4/3*PI*radius*radius;
	}
	public void showData()
	{
		System.out.println("球體積為"+vol());
		System.out.println("圓心為最標("+x+","+y+")"+"\n"+"半徑為"+radius);
	}
}
class CCircle3 extends CSphere
{	
	
	public CCircle3(int a,int b,int c)
	{
		x=a;
		y=b;
		radius=c;
	}
	
	
}
public class HW14 {
	public static void main(String args[])
	{
		CCircle3 cir = new CCircle3(8,6,2);
		cir.showData();
	}
}
