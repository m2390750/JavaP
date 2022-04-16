package Chapter14;
import java.io.*;

public class APP14_4 {
	public static void main(String args[])throws IOException
	{
//		FileWriter fw=new FileWriter("C:\\java\\random.txt");
//		BufferedWriter bfw=new BufferedWriter(fw);
//		
//		for(int i=1;i<=5;i++)
//		{
//			bfw.write(Double.toString(Math.random()));
//			bfw.newLine();
//		}
//		bfw.flush();
//		fw.close();
	
	FileOutputStream fo=new FileOutputStream("C:\\java\\random.txt");
	String str;
	for(int i=0;i<5;i++)
		{
			str=Double.toString(Math.random());
			if(i<=3)
			str+="\r\n";
			
			byte fuck[]=str.getBytes();
			fo.write(fuck);
		}
		fo.close();
	
		FileInputStream fi=new FileInputStream("C:\\java\\random.txt");
			byte fuck1[]=new byte[fi.available()];
		
			fi.read(fuck1);
		
			System.out.println(new String(fuck1));
			fi.close();
	}	
	
}