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
		System.out.println("�Ǹ���"+id+"\n"+"�W�r��"+name);
	}
	public void showScore()
	{
		System.out.println("�������Z��"+mid+"\n"+"�������Z��"+finl+"\n"+"���ɦ��Z��"+common);
	}
	public double calcu()
	{
		return ((double)(mid*3/10+finl*3/10+common*4/10));
	}
	public void show()
	{	
		showData();
		showScore();
		System.out.println("�ǥ��`���Z��"+calcu());
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
