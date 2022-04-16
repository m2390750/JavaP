package Chapter10;

class Caaa1
{
	public int num1;
	public int num2;
}

class Cbbb1 extends Caaa1
{
	public void set_num(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void show()
	{
		System.out.print("num1¬°"+num1+"\n"+"num2¬°"+num2);
	} 
}
public class HW01 {
	public static void main(String args[]) 
	{
	Cbbb1 bb=new Cbbb1();
	bb.set_num(5,10);
	bb.show();
	}
}
