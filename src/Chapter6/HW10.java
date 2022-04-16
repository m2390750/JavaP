package Chapter6;

public class HW10 {
	public static void main(String args[])
	{
		int a[][]= {{1,5,2,5,3,4},{5,12,54,85},{-14,-6422,684665968,132,321,513,613,1,8135,4,5635,135,135}};
		int min=a[0][0];
		int max=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
					min=a[i][j];
				else if (a[i][j]>max)
					max=a[i][j];
			}
			
		}
		System.out.println("最小索引值為: "+min+"最大索引值為: "+max);
		
	}

}
