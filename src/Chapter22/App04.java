package Chapter22;
import java.io.*;
import java.net.*;
public class App04 {
	public static void main(String args[])
	{
		String str;
		
		try 
		{
			URL u=new URL("file:/C:\\java\\aaa.txt");
			
			Object obj=u.getContent();
			InputStreamReader isr=new InputStreamReader((InputStream)obj);
			
			BufferedReader br=new BufferedReader(isr);
			
			while((str=br.readLine())!=null)
				System.out.println(str);
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("發生了例外"+e);
		}
	}
}
