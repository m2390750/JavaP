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
		System.out.print("�n�ͩm�W:"+name+"\n"+"�p���a�}:"+address+"\n"+"���q�q��:"+data.company+"\n"+"������X:"+data.cell);
	}
}
public class HW9_17 {
	public static void main(String args[]) {
		
	Namecard first=new Namecard("Andy","123City","2345-6789","0911-336600");
	first.show();
	}
}