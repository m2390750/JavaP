package Chapter6;

public class HW14 {
	public static void main(String args[])
	{
		int A[][][]= {{{15,50,65},{38,94,25},
						{79,44,19},{89,54,73}},
					  {{14,90,46},{43,23,67},
						{32,56,78},{94,78,40}}};
		int sum=0;
		int i,j,k;
		for(i=0;i<A.length;i++)
			{for(j=0;j<A[i].length;j++)
				{for(k=0;k<A[i][j].length;k++)
					{sum+=A[i][j][k];}}}
		
		System.out.println(sum);
	}
}
