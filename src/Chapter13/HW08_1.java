package Chapter13;

class Ctest2
{
public static void test(int num,int den) throws ArithmeticException
{
System.out.println(num+"/"+den+"="+num/den);
}
}

public class HW08_1
{
public static void main(String args[])
{
try
{
Ctest2.test(5,0);
}
catch(ArithmeticException e)
{
System.out.println("°£¼Æ¬° 0");
}
finally
{
System.out.println("end of main() method!!");
}
}
}