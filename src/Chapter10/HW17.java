package Chapter10;

class Car
{
	protected String owner;
	protected String id;
	protected String color;
	
	final void show()
	{
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P���X:"+id);
	
	}
	public void CRectangle(String own,String s)
	{
		owner=own;
		id=s;

	}
}
class CColor extends Car
{
	public String color;
	
	CColor(String own , String s,String col)
	{
		super.CRectangle(own,s);
		color=col;
	}
	public void show1()
	{
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P���X:"+id);
		System.out.println("���l�C��"+color);
		
	}
	
}
public class HW17 {	
	public static void main(String args[])
	{
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show1();
		
	}

}
