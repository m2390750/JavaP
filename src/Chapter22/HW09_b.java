package Chapter22;
import java.net.*;

import java.io.*;
public class HW09_b {
	public static void main(String args[])
	{
		
		try
		{
			System.out.println("正在與伺服器建立連線...");
			
			Socket s=new Socket("127.0.0.1",2525);//建立Socket物件
			
			System.out.println("已經與伺服器取得連線...");
			
			InputStream in=s.getInputStream();//建立輸入串流
			
			
			byte fsize[]=new byte[1000000];
			int n=in.read(fsize);
			String size=new String(fsize,0,n);
			int sz=Integer.parseInt(size);
			byte buff[]=new byte[sz];
			int m=in.read(buff);
			
			FileOutputStream fo=new FileOutputStream("C:\\java\\Patty2.jpg");
			fo.write(buff);
			
			System.out.println("已從伺服器收到"+sz+"個bytes");
						
			in.close();
			fo.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("發生了例外"+e);
		}
	}
}
