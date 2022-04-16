package Chapter8;

class Ccircle1
{
	double pi=3.14;
	double radius;
	
	void show_periphery() //show_periphery()/顯示出圓周長
	{
	System.out.println("periphery="+2*this.pi*this.radius);

	}
}

public class HW6 {
	public static void main(String args[]) {
		
		Ccircle1 cir1=new Ccircle1();
		cir1.radius=3.0;
		cir1.show_periphery();
		
	}
}