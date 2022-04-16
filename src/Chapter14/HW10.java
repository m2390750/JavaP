package Chapter14;
import java.io.*;

public class HW10 {
	public static void main(String args[])throws IOException
	{
		FileWriter FWr=new FileWriter("C:\\java\\rand.txt");
		BufferedWriter BWr=new BufferedWriter(FWr);
		int b;
		for(int i=1;i<=1000;i++)
			{
			b=(int)(Math.random()*99998+1);
			BWr.write(Integer.toString(b));
			BWr.newLine();
			}
		BWr.flush();
		FWr.close();
		
		FileReader FRr=new FileReader("C:\\java\\rand.txt");
		BufferedReader BRr=new BufferedReader(FRr);
		
		int a[]=new int[1000];
		String str;
		
		int i=0;
		int c;
		while((str=BRr.readLine())!=null )
			{	
				c=Integer.parseInt(str);
				a[i]=c;
				System.out.println(a[i]);
				i++;
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
		double average=(double)sum/i;
		
		FRr.close();
			
		System.out.println("最大值為"+amax);
		System.out.println("最小值為"+amin);
		System.out.println("總和為"+sum);
		System.out.println("平均為"+average);
		
		
	}
}
