package Chapter6;

public class HW9 {
	public static void main(String args[])
	{
		System.out.println("�P��� "+"���~A "+"���~B "+"���~C "+"���~D "+"���~E " );
		int a[][]= {{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
		int price[]= {12,16,10,14,15};
		
		for(int i=0;i<=2;i++)
		{	
			System.out.print(i+1+"     ");
			
			for (int j=0;j<=4;j++)
				System.out.print(a[i][j]+"   ");
		
			System.out.println();
		}
		
		int sum[]= new int[3];
		int max_sales=sum[0];
		int person=0;
		for(int i=0;i<=2;i++)
		{
			
			for(int j=0;j<=4;j++)
			{
			sum[i]+=a[i][j]*price[j];
			
			if(max_sales<sum[i])
				{
				
				max_sales=sum[i];
				person=i;
				}
			
			}			
			System.out.println("�P���"+(i+1)+"���P���`�B��"+sum[i]);
			
		}System.out.println("�P��̰����P�����"+(person+1)+"�P���,���P���`�B��"+max_sales);
			
		int product[]=new int[5];
		int max_product=product[0];
		int product_num=0;
		for(int j=0;j<=4;j++)
		{	
			
			for(int i=0;i<=2;i++)
			{	
				product[j]+=a[i][j]*price[j];
				
				if(max_product<product[j])
				{
				
				max_product=product[j];
				person=i;
				}
			
			}			
			System.out.println("�P�ⲣ�~"+(j+1)+"���P���`�B��"+product[j]);
			
		}System.out.println("�P�ⲣ�~�̰����P���B"+(person+1)+"���~,���P���`�B��"+max_product);
		
		
	}

}
