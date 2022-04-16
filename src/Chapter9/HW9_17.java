package Chapter9;

class Namecard
{
	private String name;
	private String address;
	private Phone data;
	
	class Phone
	{
		private String company;
		private String cell;
		
		public Phone(String s1,String s2)
		{
			company=s1;
			cell=s2;
		}
	}
	public Namecard(String na,String add,String s1,String s2)
	{
		name=na;
		address=add;
		data=new Phone(s1,s2);
	}
	void show()
	{
		System.out.print("好友姓名:"+name+"\n"+"聯絡地址:"+address+"\n"+"公司電話:"+data.company+"\n"+"手機號碼:"+data.cell);
	}
}
public class HW9_17 {
	public static void main(String args[]) {
		
	Namecard first=new Namecard("Andy","123City","2345-6789","0911-336600");
	first.show();
	}
}