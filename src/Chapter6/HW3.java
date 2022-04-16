package Chapter6;

public class HW3 {
	public static void main(String args[])
	{
		int A[]= {53,27,69,12,3,96};
		int j=0;//计
		int k=0;//案计
		
		for(int i=0;i<=5;i++)
			{
			System.out.println(A[i]);
			
			if(A[i]%2==0)
				k++;
			else
				j++;
			}
		System.out.println("Τ"+j+"计");
		System.out.println("Τ"+k+"案计");
		int	min=A[0];
		int max=A[0];
		for(int i=0;i<=5;i++)
			{
			if(A[i]>max)
				max=A[i];
			
			else if(A[i]<min)
				min=A[i];
			}
		System.out.println("程"+max);
		System.out.println("程"+min);
		}
	}
