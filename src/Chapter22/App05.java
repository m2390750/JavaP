package Chapter22;
import java.net.*;
import java.io.*;
public class App05 {
	public static void main(String args[])
	{
		try
		{
			URL u1=new URL("http://www.hinet.net");
			URL u2=new URL("file:/C:\\java\\train.txt");
			URL u3=new URL("file:/C:\\java\\Patty.jpg");
			
			URLConnection uc1=u1.openConnection();
			URLConnection uc2=u2.openConnection();
			URLConnection uc3=u3.openConnection();
			System.out.println("�j�p"+uc1.getContentLength()+"����"+uc1.getContentType());
			System.out.println("�j�p"+uc2.getContentLength()+"����"+uc2.getContentType());
			System.out.println("�j�p"+uc3.getContentLength()+"����"+uc3.getContentType());
		}
		catch(IOException e)
		{
			System.out.println("�o�ͤF�ҥ~"+e);
		}
	}
}
