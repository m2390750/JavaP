package Chapter8;

class CTest1
{	
	void test(int a)
	{
		if(a>0)
			System.out.println("���Ƭ�����");
		else if(a==0)
			System.out.println("���Ƭ�0");
		else
			System.out.println("���Ƭ��t��");
	}
	
}
public class HW8 {
	public static void main(String args[]) {
		CTest1 num = new CTest1();
		num.test(0);
		num.test(6);
		num.test(-4);
	}
}
