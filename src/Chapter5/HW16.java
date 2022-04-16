package Chapter5;

public class HW16 {
	public static void main(String args[]) 
	{
		String a = "1234";
		String b = "1234";
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("請輸入密碼: "+b);
			if(b==a)
			{
				System.out.println("密碼正確，進入系統");
				break;
			}
			
			else if(b!=a)
			{	
			if(i==3)
				{
				System.out.println("輸入達3次錯誤系統鎖定");
				break;
				}
			
			System.out.println("輸入錯誤，還剩"+(3-i)+"次機會");
			}	
		}
			
	}

}
