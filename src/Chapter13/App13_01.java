package Chapter13;

public class App13_01 {
	public static void main(String args[])
	{
		try
		{
			int arr[]=new int[5];
			arr[10]=7;
		}
		catch(ArrayIndexOutOfBoundsException asd)
		{System.out.println(asd);}
		finally
		{
			System.out.println("WOW");
		}
		
	}
}
