package Chapter22;
import java.net.*;
public class App03 {

	public static void main(String args[])
	{
		try
		{
			URL u=new URL("https://udn.com/NEWS/main.html");
			
			System.out.println("�q�T��w�W�٬�"+u.getProtocol());
			System.out.println("host name��"+u.getHost());
			System.out.println("�𸹬�"+u.getPort());
			System.out.println("�ɦW��"+u.getFile());
		}
		catch(MalformedURLException e)
		{
			System.out.println("�o�ͤF"+e+"�ҥ~");
		}
	}
}
