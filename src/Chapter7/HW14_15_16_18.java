package Chapter7;

public class HW14_15_16_18 {
	public static void main(String args[])
	{
		int a[][]= {{75,29,10},{38,45,16}};
		fmax(a);
		multiplication(a);
		
		int b[][]= {{1,4,8},{2,9,5},{6,3}};	
		average(b);
		
		int c[]= {75,29,10,38,45,17};
		System.out.println(avg(c));
		
	}	
	public static void fmax(int a[][])
	{
		int max=a[0][0];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				if(max<a[i][j])
					max=a[i][j];
		
		System.out.println(max);
	}
	
	public static void multiplication(int a[][])
	{
	int max=a[0][0];
	int min=a[0][0];
	
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
			{
				if(max<a[i][j])
				max=a[i][j];
				
				else if(min>a[i][j])
				min=a[i][j];
			}System.out.println(max*min);	
	}
	public static void average(int c[][])
	{	
		int sum=0;
		int k=0;
		for(int i=0;i<c.length;i++)
			for(int j=0;j<c[i].length;j++)
				{
				sum+=c[i][j];
				if(c[i][j]!=0)
				k++;	
				}
		System.out.println((double)sum/k);
	}
	public static double avg(int arr[])
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
			   
		return sum/arr.length;
	}
}







