package Chapter7;

public class HW11 {
	public static void main(String args[])
	{
		int arr[]= {8,6,9,12,47,55,10};
		pp(arr);
	}
	public static void pp(int a[])
	{
		for(int i=0;i<a.length;i++)
		{ 
			if(a[i]%2==1)
			System.out.println(a[i]);
		}
	}
}
