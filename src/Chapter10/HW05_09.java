package Chapter10;

class Caaa2
{
	private int num;
	Caaa2()
	{
		this(2);
	}
	public Caaa2(int n)
	{
		num=n;
	}
	public int get()
	{
		return num;
	}
	public void display()
	{
		System.out.println("\"printed from Caaa Class\"");
	}
}
class Cbbb2 extends Caaa2
{
	public void show()
	{
		System.out.println("num="+get());
	}
	public Cbbb2()
	{
		
	}
	public Cbbb2(int a)
	{
		super(a);
	}
	public void display()
	{
		System.out.println("\"printed from Cbbb Class\"");
	}
}

public class HW05_09 {
	public static void main(String args[])
	{
		Cbbb2 bb = new Cbbb2();
		bb.show();
		
		Caaa2 cc=new Cbbb2();
		cc.display();
	}

}
