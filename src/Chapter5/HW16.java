package Chapter5;

public class HW16 {
	public static void main(String args[]) 
	{
		String a = "1234";
		String b = "1234";
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("�п�J�K�X: "+b);
			if(b==a)
			{
				System.out.println("�K�X���T�A�i�J�t��");
				break;
			}
			
			else if(b!=a)
			{	
			if(i==3)
				{
				System.out.println("��J�F3�����~�t����w");
				break;
				}
			
			System.out.println("��J���~�A�ٳ�"+(3-i)+"�����|");
			}	
		}
			
	}

}
