package Chapter9;
class CCircle1
{
private static double pi=3.14;
public double radius;

public CCircle1(double r)
{
radius=r;
}
}

public class HW9_9_1
{
public static void main(String args[])
{
CCircle1 cir1=new CCircle1(1.0);
CCircle1 cir2=new CCircle1(2.0);
CCircle1 obj;

obj=compare(cir1,cir2);
if(cir1==obj)
System.out.println("radius of cir1 is larger");
else 
	System.out.println("radius of cir2 is larger");
}

public static CCircle1 compare(CCircle1 cira,CCircle1 cirb)
{
 if(cira.radius==cirb.radius)
return cira;
else
return cirb;
}
 } 