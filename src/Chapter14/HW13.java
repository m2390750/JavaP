package Chapter14;
import java.io.*;

public class HW13 {
	public static void main(String args[])throws IOException
	{
		FileOutputStream FWr=new FileOutputStream("C:\\java\\rand.txt");
		String str;
			
		for(int i=1;i<=1000;i++)
			{
			str=Integer.toString((int)(Math.random()*99998+1));
			str+="\r\n";
			
			byte egg[]=str.getBytes();
			FWr.write(egg);
			}
		FWr.close();
		
		FileInputStream FRr=new FileInputStream("C:\\java\\rand.txt");
				
		byte egg1[]=new byte[FRr.available()];
		FRr.read(egg1);
		String str1=new String(egg1);
		
		String str2[]=str1.split("\r\n");
		
		int c;
		int a[]=new int[1000];
		for(int i=0;i<1000;i++)
			{	
			c=Integer.parseInt(str2[i]);
			a[i]=c;
			System.out.println(a[i]);
			}
			
		int amax=a[0];
		int amin=a[0];
		double sum=0;
		for(int j=0;j<1000;j++)
			{		
				if(a[j]>amax)
					amax=a[j];
				else if(a[j]<amin)
					amin=a[j];
				
				sum+=a[j];
								
			}
		double average=(double)sum/1000;
				
		FRr.close();
			
		System.out.println("最大值為"+amax);
		System.out.println("最小值為"+amin);
		System.out.println("總和為"+sum);
		System.out.println("平均為"+average);
		
		
	}
}
