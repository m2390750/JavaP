package Chapter8;

class CCircle3
{
private double pi=3.14;
private double radius=5;

void show_area()
{
System.out.println("area="+pi*radius*radius);
}
void show_all()

{
System.out.println("radius="+radius);
show_area();
}
}
public class HW14
{
public static void main(String args[])
{
CCircle3 cir1=new CCircle3();


cir1.show_all();
cir1.show_area();
}
}