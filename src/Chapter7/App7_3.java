package Chapter7;

public class App7_3 {
	public static void main(String args[])
	{
		int score[]= {1,2,3,4,5,9,81};
		Largest(score);
	}
	public static void Largest(int array1[])
	{
		int max=array1[0];
		for(int i=0;i<array1.length;i++)
			if(array1[i]>max)
				max=array1[i];
		System.out.println("largest num ="+max);
	}
}
