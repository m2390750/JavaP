package Chapter11;

interface Data1
{
	public void best();
	public void failed();
}
interface Test1 extends Data1
{
	public void showData();
	public double average();
}
class CStu1 implements Test1
{
	protected String name;
	protected int math;
	protected int english;

	public CStu1(String a,int b,int c)
	{
		name=a;
		math=b;
		english=c;
	}
	public void best()
	{
		if(math>english)
		System.out.println(name+"���ƾǤ�^��n");
		
		else
		System.out.println(name+"���^���ƾǦn");
			
	}
	public void failed()
	{
		if(math<60)
			System.out.println("�ƾǷ��F");
		if(english<60)
			System.out.println("�^����F");
			
	}
	public void showData()
	{
		System.out.print(name+"\n"+math+"\n"+english+"\n");
	}
	public double average()
	{
		return (double)(math+english)/2;
	}
	public void show()
	{
		showData();
		best();
		failed();
		System.out.print(average());
	}

}
public class HW12 {
	public static void main(String args[])
	{
		CStu1 stu=new CStu1("Judy",58,91);
		stu.show();
	}
}
