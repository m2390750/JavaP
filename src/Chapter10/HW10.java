package Chapter10;

class Caaa3
{

}
class Cbbb3 extends Caaa3{}
class Cccc3 extends Cbbb3{}

public class HW10 {
	public static void main(String args[])
	{
		Cbbb3 b1 = new Cbbb3();
		Cbbb3 b2 = new Cccc3();
//		Cccc3 c1 = new Caaa3();
//		Cccc3 c2 = new Cbbb3();
	}
}
