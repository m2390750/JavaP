package Chapter22;
import java.net.*;
import java.io.*;
public class App06 {
	public static void main(String args[])
	{
		try
		{
			ServerSocket svs=new ServerSocket(2525);
			
			System.out.println("���ԫȤ�ݪ��ШD...");
			Socket s=svs.accept();
			
			System.out.println("�Ȥ�ݤw�M�����s�W�u...");
			
			OutputStream out=s.getOutputStream();
			String str="Honor shows the man.";
			System.out.println("��ƥ��b�ǰe��...");
			
			out.write(str.getBytes());
			out.close();
			s.close();
			System.out.println("��ƶǰe����...");
		}
		catch(Exception e)
		{
			System.out.println("�o�ͤF�ҥ~"+e);
		}
	}
}
