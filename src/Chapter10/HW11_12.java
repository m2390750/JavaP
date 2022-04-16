package Chapter10;

class CShape
{	
//	protected int radius;
//	protected int side;
	protected  double PI=3.14;
//	protected int base;
//	protected int height;
	
	public double area()
	{
	return 0.0;
	}
}

class CCircle extends CShape
{	
	double radius;
	public CCircle(double a)
	{
		radius=a;
	}
	public double area()
	{
	return 2*PI*radius;
	}
}

class CSquare extends CShape
{
	double side;
	public CSquare(double a)
	{
		side=a;
	}
	public double area()
	{
		return side*side;
	}
}

class CTriangle1 extends CShape
{	
	double base,height;
	public CTriangle1(double a,double b)
	{
		base=a;
		height=b;
	}
	public double area()
	{
		return base*height/2.0;
	}
}
	public class HW11_12 {
		public static void main(String args[])
		{
			CCircle a = new CCircle(1.0);
			CCircle b = new CCircle(2.0);
			CSquare c = new CSquare(1.0);
			CSquare d = new CSquare(2.0);
			CTriangle1 e =new CTriangle1(2.0,3.0);
			CTriangle1 f =new CTriangle1(3.0,2.0);
			
			double large[]=new double[6];
			large[0]=a.area();
			large[1]=b.area();
			large[2]=c.area();
			large[3]=d.area();
			large[4]=e.area();
			large[5]=f.area();
			System.out.println(a.area());
			System.out.println(b.area());
			System.out.println(c.area());
			System.out.println(d.area());
			System.out.println(e.area());
			System.out.println(f.area());
			
			double max=large[0];
			for(int i=0;i<=5;i++)
			{
				if(max<large[i])
					max=large[i];
			}
			System.out.println("所有面積最大為"+max);
			
			CShape sss[]=new CShape[6];
			sss[0]=new CCircle(2.5);
			sss[1]=new CCircle(2.5);
			sss[2]=new CSquare(2.5);
			sss[3]=new CSquare(3.5);
			sss[4]=new CTriangle1(8.0,10.0);
			sss[5]=new CTriangle1(11,9);
			
			for(int i=0;i<sss.length;i++)
			System.out.println("area of shp["+i+"]="+sss[i].area());
			System.out.println("The largest area is "+largest(sss));
		}
			public static double largest(CShape a[])
			{
			double max=a[0].area();
			
			for(int i=0;i<a.length;i++)
			{if(max<a[i].area())
				{max=a[i].area();}};
		
				return max;
			}
			
			
		
}
