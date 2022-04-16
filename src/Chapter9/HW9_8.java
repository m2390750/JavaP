package Chapter9;

class CWin
{
	static int cnt =0;
	int width,height;
	String color;
	
	public CWin(String str,int w,int h)
	{
		color=str;
		width=w;
		height=h;
		count();
	}
	public CWin()
	{
		this("red",2,2);
	}
	
	
	public static void count()
	{
		cnt++; 
	}
	
	static void setZero()
	{
		cnt=0;
	}
	static void setValue(int n)
	{
		cnt=n;
	}
	static void show_cnt()
	{
		System.out.println("物件已經被建立"+cnt+"次");
	}
	void show_all()
	{
		System.out.println("顏色為:"+color+"寬為"+width+"高為"+height);
	}
}
public class HW9_8 {
	public static void main(String args[])
	{
		CWin a=new CWin();
		CWin.show_cnt();
		CWin b=new CWin();
		CWin.show_cnt();
			
		CWin.setZero();
		CWin.show_cnt();
		CWin.setValue(10);
		CWin.show_cnt();
		b.show_all();
		a.show_all();
		CWin c=new CWin("Green",4,6);
		c.show_all();
		CWin.show_cnt();
	}
}
