package Chapter14;
import java.io.*;
public class HW04 {
	public static void main(String args[])
	{	
		try {
		char data[]=new char[122];
		FileReader fr=new FileReader("C:\\java\\donkey.txt");
		fr.skip(0);
		int num=fr.read(data);//把讀到的字元存入data
		
		String str=new String(data,0,num);//將data轉換為
		System.out.println(str);
		System.out.println("Characters read= "+num);
		
		fr.close();}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
