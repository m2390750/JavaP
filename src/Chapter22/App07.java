package Chapter22;
import java.net.*;
import java.io.*;
public class App07 {
	public static void main(String args[])
	{
		byte buff[]=new byte[1024];
		try
		{
			System.out.println("���b�P���A���إ߳s�u...");
			
			Socket s=new Socket("127.0.0.1",2525);//�إ�Socket����
			
			System.out.println("�w�g�P���A�����o�s�u...");
			
			InputStream in=s.getInputStream();//�إ߿�J��y
			
			int n=in.read(buff);//�q��yŪ�J���
			System.out.println(n);
			System.out.println(buff.length);
			System.out.print("�q���A������: ");
			System.out.println(new String(buff,0,buff.length));//�L�XŪ�J�����e
			in.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("�o�ͤF�ҥ~"+e);
		}
	}
}
