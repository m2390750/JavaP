package Chapter22;
import java.net.*;

import java.io.*;
public class HW09_b {
	public static void main(String args[])
	{
		
		try
		{
			System.out.println("���b�P���A���إ߳s�u...");
			
			Socket s=new Socket("127.0.0.1",2525);//�إ�Socket����
			
			System.out.println("�w�g�P���A�����o�s�u...");
			
			InputStream in=s.getInputStream();//�إ߿�J��y
			
			
			byte fsize[]=new byte[1000000];
			int n=in.read(fsize);
			String size=new String(fsize,0,n);
			int sz=Integer.parseInt(size);
			byte buff[]=new byte[sz];
			int m=in.read(buff);
			
			FileOutputStream fo=new FileOutputStream("C:\\java\\Patty2.jpg");
			fo.write(buff);
			
			System.out.println("�w�q���A������"+sz+"��bytes");
						
			in.close();
			fo.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("�o�ͤF�ҥ~"+e);
		}
	}
}
