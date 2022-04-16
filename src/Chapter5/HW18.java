package Chapter5;

public class HW18 {
	public static void main(String args[]) 
	{
		int j = 0;
		int i = 0;
		for(i=1;i<=555555555;i++)
		{	
			if(i>=19)
				continue;
			
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
			{j=i;}
			
			
		
			
		}
		System.out.println(j);	
	}

}
