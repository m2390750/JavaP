package Chapter14;
import java.io.*;
public class HW05 {
	public static void main(String args[])throws IOException
	{	
		char data[]=new char[122];
		FileReader fr=new FileReader("C:\\java\\donkey.txt");
	
		BufferedReader bfr=new BufferedReader(fr);
		
		int count=0;
		String str;
		while((str=bfr.readLine())!=null)
		{
			if(count==2)
				bfr.skip(14);
			
			else {
			System.out.println(str);
			count++;}
		}
		fr.close();
	}
}
