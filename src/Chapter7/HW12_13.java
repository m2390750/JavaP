package Chapter7;

public class HW12_13 {
	public static void main(String args[])
	{
		int a[]= {75,29,38,45,16};
		min(a);
	}
	public static void min(int a[])
	{
	int min=a[0];	
	int min_num=0;
	for(int i=0;i<a.length;i++)
		{
		if(min>a[i])
		{
		min=a[i];
		min_num=i;
		}
		}
		System.out.println(min);
		System.out.println("最小的為"+min_num+"號位");
		
	}	
}
