package Chapter14;

import java.io.*;
public class App14_1 {

	public static void main(String args[])throws IOException
	{
		char data[]=new char[128];
		FileReader fr=new FileReader("C:\\java\\train.txt");
		
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("Characters read= "+num);
		System.out.println(str);
		
		fr.close();
	}
}
