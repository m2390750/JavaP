package Chapter9;

class CBox
{
	private int length;
	private int width;
	private int height;
	
	public CBox(int l,int w,int h)
	{
		length=1;
		width=w;
		height=h;
	}
	
	public CBox()
	{
		length=2;
		width=2;
		height=2;
	}
	
	public void show()
	{
		System.out.print("length"+length);
		System.out.print(",width"+width);
		System.out.print(",height"+height);
	}
}
public class HW9_4 {
	public static void main(String args[])
	{
		CBox box1=new CBox();
		box1.show();
	}
}
