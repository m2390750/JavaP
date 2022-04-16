package Chapter9;
class CCircle2
{
private static double pi=3.14;
private double radius;

public CCircle2(double r)
{
	radius=r;
}
public static double average(CCircle2 c[])
{
	double sum=0;
	int j=0;
	for(int i=0;i<c.length;i++)
		{sum+=c[i].radius; j++;}
	return sum/j;
}
public static double compare(CCircle2 c[])
{
	double max=0.0;
	for(int i=0;i<c.length;i++)
		if(c[i].radius>max)
			max=c[i].radius;
	return max;
}

}
public class HW9_14 {
	public static void main(String args[])
	{
		
		CCircle2 cir[];
		cir=new CCircle2[3];
		cir[0]=new CCircle2(1.0);
		cir[1]=new CCircle2(4.0);
		cir[2]=new CCircle2(2.0);
		
		System.out.println(CCircle2.average(cir));
		
		System.out.println("Largest radius = "+CCircle2.compare(cir));
	}
}
