package Chapter16;

class CMember<T>
{
	private T id;
	public void setID(T value)
	{
		id=value;
	}
	public void show()
	{
		System.out.println("id="+id);
	}
}
public class App16_2 {
	public static void main(String args[])
	{
			CMember<Integer> a=new CMember<Integer>();
			CMember<String> b=new CMember<String>();
			CMember<Double> c=new CMember<Double>();
			a.setID(565);
			b.setID("Patty is 18 age");
			c.setID(212127.72172);
			a.show();
			b.show();
			c.show();
	}
}
