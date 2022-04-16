package Chapter7;

public class HW17 {
	public static void main(String args[])
	{
		int a[][]= {{1,4,8},{2,9,5},{6,2}};
		square(a);
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
		System.out.println(a[i][j]);
		
	}
		public static void square(int b[][])
		{
			for(int i=0;i<b.length;i++)
				for(int j=0;j<b[i].length;j++)
					b[i][j]=b[i][j]*b[i][j];
		}	
}
