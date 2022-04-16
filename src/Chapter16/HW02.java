package Chapter16;

class CMember1<T>
	{
	private T id;
	public void CMember1(T value)
		{
		id=value;
		
		}
	public void show()
	{
		System.out.println(id);
	}
}
public class HW02 {
	public static void main(String args[])
	{
	CMember1<Integer> a=new CMember1<Integer>();
	CMember1<String> b=new CMember1<String>();
	CMember1<Double> c=new CMember1<Double>();
	
	a.CMember1(587);
	b.CMember1("5487");
	c.CMember1(587d);
	a.show();
	b.show();
	c.show();
	}
}
