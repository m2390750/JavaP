 package Chapter13;

public class HW04 {
	
	public static void main(String args[]) 
	{
		int num=12;
		int den[]= {12,0,3,0,0,4};
		
		
		for(int i=0;i<10;i++) {
			if(den[i]==0)
				System.out.print("除數為0");
			else if(i>den.length)
				System.out.print("超過範圍");
			else
			System.out.println("ans="+num/den[i]);}
	}
}
