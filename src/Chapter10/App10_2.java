package Chapter10;

class Caaa4
{
	private int num;
	
	public Caaa4(int n)
	{
		num=n;
	}
	public String toString()
	{
		String str="toString() called, num="+num;
		return str;
	}
}
public class App10_2 {
	public static void main(String args[])
	{
		Caaa4 a =new Caaa4(3);
		System.out.println(a);
	}
}
