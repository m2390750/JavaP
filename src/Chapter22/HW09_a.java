package Chapter22;
import java.net.*;

import java.io.*;
public class HW09_a {
	public static void main(String args[])
	{
		try
		{
			ServerSocket svs=new ServerSocket(2525);
			
			System.out.println("���ԫȤ�ݪ��ШD...");
			Socket s=svs.accept();
			
			System.out.println("�Ȥ�ݤw�M�����s�W�u...");
			
			OutputStream out=s.getOutputStream();
			FileInputStream fi=new FileInputStream("C:\\java\\Patty.jpg");
			int size=fi.available();
//			System.out.println(size);
//			System.out.println(size);
//			System.out.println(size);
//			System.out.println(size);
//			System.out.println(size);
//			System.out.println(Integer.toString(size));
//			System.out.println(Integer.toString(size));
//			System.out.println(Integer.toString(size).getBytes());
//			System.out.println(Integer.toString(size).getBytes());
//			System.out.println(Integer.toString(size).getBytes());
			out.write((Integer.toString(size)).getBytes());//�������o�B�n�F��
//			System.out.println("��ƥ��b�ǰe��...");
			
			byte data[]=new byte[fi.available()];
			fi.read(data);
			out.write(data);
			
			fi.close();
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
