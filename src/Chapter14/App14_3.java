package Chapter14;

import java.io.*;

public class App14_3 {
	public static void main(String args[])throws IOException
	{
		String str;
		int count=0;
		
		FileReader fr=new FileReader("C:\\java\\number.txt");
		BufferedReader bfr=new BufferedReader(fr);
		
		while((str=bfr.readLine())!=null)
		{
			count++;
			System.out.println(str);
		}
		System.out.println(count+" lines read");
		fr.close();		
	}
}
