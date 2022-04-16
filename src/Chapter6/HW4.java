package Chapter6;

public class HW4 
{
	public static void main(String args[])
	{
		int array[]= {3,5,0,3,2,4,1,6,8,5,4,3,2};
		System.out.println(array.length);
		
		int j=0;
		for(int i=0;i<=12;i++)
		{
			if(array[i]>=3 && array[i]<=6)
			j++;
		}
		System.out.println(j);
		
	}
	
	

}
