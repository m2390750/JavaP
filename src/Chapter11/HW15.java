package Chapter11;

class CShape5
{}

class CCircle5 extends CShape5
{}

class CTriangle5 extends CShape5
{}

class CCoin5 extends CCircle5
{}

 
public class HW15 {
	public static void main(String args[])
	{
		CCircle5 cicrle = new CCircle5();
		CTriangle5 triangle = new CTriangle5();
		CCoin5 coin = new CCoin5();
		boolean answer;
		answer=cicrle instanceof CCoin5;//false
		System.out.println(answer);
		answer=triangle instanceof CShape5;//true
		System.out.println(answer);
		answer=coin instanceof Object;//true
		System.out.println(answer);
		answer=null instanceof Object;//true
		System.out.println(answer);
 	}
}
