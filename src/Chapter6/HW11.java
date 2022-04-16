package Chapter6;
class HW11 {
	public static void main(String arg[]) 
	{
		int a[][]= {{1,2,3},{4,5,6}};

		for(int i=0;i<=1;i++)
			{
			for(int j=0;j<=2;j++)
				{
				a[i][j]=a[i][j]*a[i][j];
				System.out.print(a[i][j]);
				}
			}
		
	}
}
