package Chapter6;

public class HW8 {
	public static void main(String args[])
	{
		double a[][]= {{18.2,17.3,15.0,13.4},
					   {23.8,25.1,20.6,17.8},
					   {20.6,21.5,18.4,15.7}};
		
		for(int i=0;i<=2;i++)
			{
			for(int j=0;j<=3;j++)
				System.out.print(a[i][j]+" ");
				System.out.println();
			}
		
		for(int j=0;j<=3;j++)
			{	
			double sum=0f;
			
			for(int i=0;i<=2;i++)
			{
			sum+=a[i][j];}
			System.out.println("琍戳"+(j+1)+"キА放"+(sum/3d));
			}
		
		for(int i=0;i<=2;i++)
			{
			double sum=0f;
			
			for(int j=0;j<=3;j++)
			{
			sum+=a[i][j];
			}
			System.out.println("琿"+(i+1)+"キА放"+(sum/4d));
			}
		double max=a[0][0];
		double min=a[0][0];
		int maxday=0;
		int minday=0;
		int maxtime=0;
		int mintime=0;
		for(int i=0;i<=2;i++)
		{
			
		for(int j=0;j<=3;j++)
			{
			if(a[i][j]>max)
				{
				max=a[i][j];
				maxday=i+1;
				maxtime=j+1;
				}
			else if(a[i][j]<min)
				min=a[i][j];
				minday=i+1;
				mintime=j+1;
			}
		}
		System.out.println("放程蔼ら琍戳"+maxday+",琿"+maxtime);
		System.out.println("放程蔼ら琍戳"+minday+",琿"+mintime);
		System.out.println(max);
		System.out.println(min);
		
	}
}
