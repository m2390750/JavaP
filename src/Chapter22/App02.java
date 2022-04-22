package Chapter22;
import java.net.*;
public class App02 {
	public static void main(String args[])
	{
		try
		{
			InetAddress adr;//宣告
			adr=InetAddress.getByName("poedb.tw");//取得IP位址
			System.out.println(adr);
		}
		catch(UnknownHostException e)
		{
			System.out.println("無法取得IP位址");
		}
	}
}
