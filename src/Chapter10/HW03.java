package Chapter10;

class Caaa
{
	public int num1;
	public int num2;
	
	Caaa()
	{
		num1=1;
		num2=1;
	}
	Caaa(int a,int b)
	{
		num1=a;
		num2=b;
	}
}

class Cbbb extends Caaa
{	
	public void set_num(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void show()
	{
		System.out.println("num1¬°"+num1+"\n"+"num2¬°"+num2);
	} 
	Cbbb(int a,int b)
	{
		super(a,b);
	}
	Cbbb()
	{
		super();
	}
}
public class HW03 {
	public static void main(String args[]) 
	{
	Cbbb bb=new Cbbb();
	bb.show();
	Cbbb cc=new Cbbb(8,7);
	cc.show();
	}
}