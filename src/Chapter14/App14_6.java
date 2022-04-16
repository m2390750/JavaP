package Chapter14;
import java.io.*;
public class App14_6 {
	public static void main(String args[])throws IOException
	{
		FileInputStream fi = new FileInputStream("C:\\java\\Patty.jpg");
		FileOutputStream fo = new FileOutputStream("C:\\java\\Patty1.jpg");
		
		System.out.println("file size="+fi.available());
		byte data[]=new byte[fi.available()];
		
		fi.read(data);
		fo.write(data);
		
		System.out.println("file copied and renamed");
		fi.close();
		fo.close();
	}

}
