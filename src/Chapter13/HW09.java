package Chapter13;
class Ctest1
{
	public static void aaa(int a,int b)throws ArithmeticException
	{
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}

}
public class HW09 {
	public static void main(String args[])
	{
		
		try
		{Ctest1 a=new Ctest1();a.aaa(4,0);}
		
		catch(ArithmeticException e)
		{System.out.println(e+" throwed");}
	}
}
