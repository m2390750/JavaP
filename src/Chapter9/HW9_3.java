package Chapter9;

class Caaa
{
	private int value;
	
	public Caaa()
	{
		value=10;
	}
	public Caaa(int i)
	{
		value=i;
		System.out.println("value="+value);
	}
	void showcase()
	{
		System.out.println("value="+value);
	}
  }

public class HW9_3 {
	public static void main(String args[]) 
	{
		Caaa obj1=new Caaa();
		Caaa obj2=new Caaa(12);
		obj1.showcase();
	}
}
