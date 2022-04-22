package Chapter22;
import java.net.*;
public class App01 {
	public static void main(String args[])
	{
		try
		{
			InetAddress adr=InetAddress.getLocalHost();
			System.out.println(adr.getHostAddress());
			System.out.println(adr.getHostName());
			System.out.println(adr);
		}
		catch(UnknownHostException e)
		{
			System.out.println(e);
			System.out.println("無法取得IP位址");
		}
	}
}
