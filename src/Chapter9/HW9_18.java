package Chapter9;

public class HW9_18 {
	public static void main(String args[])
	{
		(
			new CCircle4(2.0)
			{
			void show()
				{
				System.out.println(radius*radius*pi);
				}
			}	
		).show();
	}
	static class CCircle4
	{
		public double pi=3.14;
		public double radius;
		
		public CCircle4(double r)
		{
			radius=r;
		}
	}
}
 