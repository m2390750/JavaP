package Chapter5;

public class HW14 {
	public static void main(String args[])
	{
		float i =3500;
		int j =0;
		
		while(i>0)
			{
			 i/=2;
			 j++;
			 System.out.println(i);
			 if(i<3)
				 break;
			}
		System.out.println("����÷�l��O"+j+"�Ѥ~�|�p��3����");
	}
}
