package Chapter6;

public class App6_3 {
	public static void main(String args[])
	{
		int sum=0;
		int a[]= {62,7,12,3,8,47};
		
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		
		System.out.println("Average" +(float)sum/a.length);
	}

}
