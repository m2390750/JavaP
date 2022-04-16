package Chapter10;

class CTriangle
{
	protected int base;
	protected int height;
	
	public CTriangle(int a ,int b)
	{
		base=a;
		height=b;
	}
	
	protected void show()
	{
		System.out.println("base="+base+", height="+height);
	}
}

class CData1 extends CTriangle
{
	public CData1(int a ,int b)
	{
		super(a,b);
	}
	public void area()
	{	
		show();
		System.out.println("Area="+base*height/2.0);
	}
	public void show()
	{	
		
		System.out.println("base="+base+", height="+ height);
	}
}

public class HW06 {
	public static void main(String args[])
	{
		CData1 obj=new CData1(3,8);
		obj.area();
	}
}
