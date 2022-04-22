package Chapter22;
import java.net.*;

import java.io.*;
public class HW09_a {
	public static void main(String args[])
	{
		try
		{
			ServerSocket svs=new ServerSocket(2525);
			
			System.out.println("等候客戶端的請求...");
			Socket s=svs.accept();
			
			System.out.println("客戶端已和本機連上線...");
			
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
			out.write((Integer.toString(size)).getBytes());//不太懂這步要幹嘛
//			System.out.println("資料正在傳送中...");
			
			byte data[]=new byte[fi.available()];
			fi.read(data);
			out.write(data);
			
			fi.close();
			out.close();
			s.close();
			System.out.println("資料傳送完畢...");
		}
		catch(Exception e)
		{
			System.out.println("發生了例外"+e);
		}
	}
}
