package Chapter7;

public class App7_2 {
	public static void main(String args[])
	{
		int i;//需告整數變數i,只在main()函數裡有效
		i=star(9);//傳入9給START,並以i接受回傳
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
