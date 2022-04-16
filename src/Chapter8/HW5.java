package Chapter8;

class CBox
{
	int length;
	int width;
	int height;
	
	int volume()
	{
		return length*width*height;
	}
	
	int surfaceArea()
	{
		return 2*(length*width+length*height+width*height);
	}
	void showData()
	{
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
	}
	void showAll()
	{
		showData();
		System.out.println(surfaceArea());
		System.out.println(volume());
	}
	
}
public class HW5 {
	public static void main(String args[]) {
	CBox box= new CBox();
	box.length=1;
	box.width=1;
	box.height=1;
	box.showAll();

	CBox box1=new CBox();
	System.out.println(box1.length);
	}	
}
