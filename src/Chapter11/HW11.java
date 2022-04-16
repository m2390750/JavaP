package Chapter11;

class CStu implements Data,Test
{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	
	public CStu(String a,String b,int c,int d,int e)
	{
		id=a;
		name=b;
		mid=c;
		finl=d;
		common=e;
	}
	public void showData()
	{
		System.out.println("學號為"+id+"\n"+"名字為"+name);
	}
	public void showScore()
	{
		System.out.println("期中成績為"+mid+"\n"+"期末成績為"+finl+"\n"+"平時成績為"+common);
	}
	public double calcu()
	{
		return ((double)(mid*3/10+finl*3/10+common*4/10));
	}
	public void show()
	{	
		showData();
		showScore();
		System.out.println("學生總成績為"+calcu());
	}
}
interface Data
{
	public void showData();
}
interface Test
{
	public void showScore();
	public double calcu();
}


public class HW11 {
	public static void main(String args[])
	{
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();
	}
}
