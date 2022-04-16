package Chapter10;

class CRectangle
{
	private int length;
	private int width;
	
	public CRectangle()
	{
		length=2;
		width=2;
	}
	public CRectangle(int l,int w)
	{
		length=l;
		width=w;
	}
	private void show()
	{
		System.out.print("length="+length);
		System.out.print(", width="+width);
	}
	public void area()
	{
		show();
		System.out.print(", Area="+width*length+"\n");
	}
}

class CData extends CRectangle
{
	public CData(int l,int w)
	{
		super(l,w);
	}
	public CData()
	{
		
	}
}

public class HW04 {
	public static void main(String args[])
	{
		CData obj1=new CData(3,8);
		CData obj2=new CData();
		obj1.area();
		obj2.area();
	}
}
