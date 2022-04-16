 package Chapter13;

public class HW05 {
	
	public static void main(String args[]) 
	{
		
		
		
			int num=12;
			int den[]= {12,0,3,0,0,4};
		for(int i=0;i<10;i++) 
			try{System.out.println("ans="+num/den[i]);}
			
			catch(Exception e)
				{System.out.println(e);}
//			catch(ArrayIndexOutOfBoundsException e)
//				{System.out.println("陣列註標超出了範圍");}
//			catch(ArithmeticException e)
//				{System.out.println("除數為0");}	
			
	}
}
