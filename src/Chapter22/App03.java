package Chapter22;
import java.net.*;
public class App03 {

	public static void main(String args[])
	{
		try
		{
			URL u=new URL("https://udn.com/NEWS/main.html");
			
			System.out.println("通訊協定名稱為"+u.getProtocol());
			System.out.println("host name為"+u.getHost());
			System.out.println("埠號為"+u.getPort());
			System.out.println("檔名為"+u.getFile());
		}
		catch(MalformedURLException e)
		{
			System.out.println("發生了"+e+"例外");
		}
	}
}
