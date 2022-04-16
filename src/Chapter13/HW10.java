package Chapter13;

class RadiusIsNegative extends Exception
{
	public String toString()	
	{
		return "太小";
	}
}

class RadiusTooLarge extends Exception
{
	public String toString()
	{
		return "太大";
	}
}
class CCircle
{
	private double radius;
	public void setRadius(double r)throws RadiusIsNegative,RadiusTooLarge
	{
		if(r<0)
		{throw new RadiusIsNegative();}
		else if(r>100)
		{throw new RadiusTooLarge();}
		else
			radius=r;
	}
	
	public void show()
	{
		System.out.println("area="+3.14*radius*radius);
	}
}

public class HW10 {
	public static void main(String args[])
	{
		CCircle cir=new CCircle();
		for(int i=-100;i<=102;i++) 
		{
		try
		{	
			
			cir.setRadius(i);
			cir.show();
			
		}
		catch(RadiusIsNegative e)
		{System.out.println(e.toString());}
		catch(RadiusTooLarge e)
		{System.out.println(e.toString());}
		
		}
	}
}