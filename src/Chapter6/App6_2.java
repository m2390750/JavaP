package Chapter6;

public class App6_2 {
	public static void main(String args[])
	{
		int i;
		int a[]=new int[4];
		
		a[0]=9;
		a[1]=6;
		
		for(i=0;i<a.length;i++)
			System.out.print("a["+i+"]="+a[i]+",\t");
		
		System.out.print(a.length);
		}

}
