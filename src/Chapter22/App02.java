package Chapter22;
import java.net.*;
public class App02 {
	public static void main(String args[])
	{
		try
		{
			InetAddress adr;//�ŧi
			adr=InetAddress.getByName("poedb.tw");//���oIP��}
			System.out.println(adr);
		}
		catch(UnknownHostException e)
		{
			System.out.println("�L�k���oIP��}");
		}
	}
}
