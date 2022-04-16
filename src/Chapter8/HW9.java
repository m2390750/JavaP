package Chapter8;

class CCalculator
{
	int a,b,c;
	public void set_value(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	void show()
	{
		System.out.println(a+" "+b+" "+c);
	}
	int add()
	{
		return a+b+c; 
	}
	int sub()
	{
		return a-b-c;
	}
	int mul()
	{
		return a*b*c;
	}
	double avg()
	{
		return (a+b+c)/3.0;	
	}
}
public class HW9 {
	public static void main(String args[]) 
	{
		CCalculator a = new CCalculator();
		a.set_value(25,3,7);
		a.show();
		System.out.println(a.add());
		System.out.println(a.sub());
		System.out.println(a.mul());
		System.out.println(a.avg());
	}

}
