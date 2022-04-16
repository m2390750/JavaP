package Chapter8;

class CTest{
	
	void test(double a)
	{
		if(a%2==0&&a!=0)
			System.out.println("计案计");
		else if(a==0)
			System.out.println("计0");
		else
			System.out.println("计计");
	}
	
}
public class HW7 {
	public static void main(String args[]) {
		CTest num=new CTest();
		num.test(2);
		num.test(0);
		num.test(-2);
		num.test(51);
	}
}
