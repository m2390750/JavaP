package Chapter8;

class CTest{
	
	void test(double a)
	{
		if(a%2==0&&a!=0)
			System.out.println("���Ƭ�����");
		else if(a==0)
			System.out.println("���Ƭ�0");
		else
			System.out.println("���Ƭ��_��");
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
