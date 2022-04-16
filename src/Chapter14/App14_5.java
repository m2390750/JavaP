package Chapter14;
import java.io.*;
public class App14_5 {
	public static void main(String args[])throws IOException
	{
		FileInputStream fi= new FileInputStream("C:\\java\\train.txt");
		System.out.println("file size="+fi.available());
		byte ba[]=new byte[fi.available()];
		
		fi.read(ba);
		String c=new String(ba);
		System.out.println(c);
		fi.close();
	}
}
