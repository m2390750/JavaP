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
		System.out.println("此條繩子花費"+j+"天才會小於3公尺");
	}
}
