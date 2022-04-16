package Chapter12;

import java.math.*;

public class HW18 {
	public static void main(String args[])
	{
		BigInteger a=new BigInteger("8786567886771666523775892");
		BigInteger b=new BigInteger("1126838773993333890888316");
		BigInteger c=a.add(b);
		System.out.println("a+b="+c);
		System.out.println("a-b="+a.add(b.negate()));
		System.out.println("a-b="+a.subtract(b));
		System.out.println("a*b="+a.multiply(b));
		System.out.println("a/b="+a.divide(b));
		System.out.println("a^3="+a.pow(3));
		System.out.println("gcd(a,b)="+a.gcd(b)
		);
	}
}
