package Chapter9;

class CRectangle
{
	private int width;
	private int height;
	
	public CRectangle(int w,int h)
	{
		width=w;
		height=h;
	}
	void CRectangle()
	{
		width=20;
		height=10;
	}
	public CRectangle()
	{
		this(10,8);//必須使用在第一行敘述
		System.out.println("constructor CRectangle() called");
	}
	public void show()
	{
	System.out.println("width="+width);
	System.out.println("height="+height);
	}
	
}
public class HW9_1 {
	 public static void main(String args[]) {
		 CRectangle c = new CRectangle(5,4);
		 CRectangle a = new CRectangle(5,4);
		 CRectangle b = new CRectangle();
		 c.show();
		 a.show();
		 b.show();
		 b.CRectangle();
		 b.show();
	 }
}
