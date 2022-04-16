package Chapter10;

class CRectangle3
{
	protected int length;
	protected int width;
	
	public CRectangle3(int l,int w)
	{
		length=l;
		width=w;
	}
	public String toString()
	{
		String str="length="+length+", width="+width+", area="+length*width;
		
		return str;
	}
	public String toString(int a,int b)
	{
		if(a<b)
		return super.toString();
		
		else 
			return "\\Argument Error\\";
		
	}

}
public class HW19 {
	public static void main(String args[])
	{
		CRectangle3 rect=new CRectangle3(2,6);
		System.out.println("length="+rect.length);
		System.out.println("width="+rect.width);
		System.out.println("area="+rect.length*rect.width);
		System.out.println(rect+"\n"+"\n"+"\n");
		System.out.println(rect.toString());
		System.out.println(rect.toString(8,4));
		System.out.println(rect.toString(3,5));
	}

}
