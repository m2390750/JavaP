package Chapter6;

public class HW2 {
	public static void main(String args[])
	{
		int a[]= {18,-51,23,35,10,9,-3,52,81,69};
		int b[]= {28,32,-35,40,73,17,92,32,13,29};
		int i=0,j=9;
		int sum=0;
		
		for(i=0;i<=9;i++)
		{
			sum+=a[i]*b[j];
			j--;
		}
		System.out.println(sum);			
	}

}
