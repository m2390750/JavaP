package Chapter5;

public class HW8_9_10 {
	public static void main(String[] args) 
	{	//8
		for(int i=1;i<=100;i++)
		{
			if(i%16==0)
				System.out.print(i+" ");
		}
		
		int sum=0;
		//9
		for(int i=1;i<=100;i++)
		{
			sum+=i*i;
		}
		System.out.println(sum);
		
		//10
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<=j;i++)
		System.out.print(i);
		System.out.println();
		}
	}
}
