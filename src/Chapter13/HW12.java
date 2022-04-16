package Chapter13;
class NotTriangle extends Exception
{
	public String toString()	
	{
		return "不構成三角形";
	}
}

class NotEquilateralTrinangle extends Exception
{
	public String toString()
	{
		return "這不是正三角形";
	}
}
class EquilateralTriangle extends Exception
{
	public String toString()
	{
		return "這是正三角形";
	}
}
public class HW12 {
	
	public static void main(String args[])
	{
		
		try
		{triangle1(0.2,20,21);
		triangle1(6,6,6);
		triangle1(200.2,20,21);}
		
		catch(NotEquilateralTrinangle e)
		{System.out.println(e);}
		
		catch(EquilateralTriangle e)
		{System.out.println(e);}
		
		catch(NotTriangle e)
		{System.out.println(e);	}
	}
		public static void triangle1(double a,int b,int c)throws NotTriangle,EquilateralTriangle,NotEquilateralTrinangle 	
		{
			if((a+b)<c||(b+c)<a||(a+c)<b)
				throw new NotTriangle();
		
			else if(a==b&&a==c&&b==c)
				throw new EquilateralTriangle();
			
			else
				throw new NotEquilateralTrinangle();
		}
}
		
		
	

