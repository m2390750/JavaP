package Chapter7;

public class App7_2 {
	public static void main(String args[])
	{
		int i;//�ݧi����ܼ�i,�u�bmain()��Ƹ̦���
		i=star(9);//�ǤJ9��START,�åHi�����^��
		System.out.println(i+" stars printed");
	}
	
	public static int star(int n)
	{
		int i;
		for(i=1;i<=2*n;i++)
			System.out.print("*");
		System.out.print("\n");
		return 2*n;
	
	}
}
