package Chapter14;
import java.io.*;

public class HW08 {
		public static void main(String args[])throws IOException
		{
			
			FileWriter FWa=new FileWriter("C:\\java\\aaa.txt");
			FileWriter FWb=new FileWriter("C:\\java\\bbb.txt");
			FileWriter FWc=new FileWriter("C:\\java\\ccc.txt");
			
			BufferedWriter BWa=new BufferedWriter(FWa);
			BufferedWriter BWb=new BufferedWriter(FWb);
			BufferedWriter BWc=new BufferedWriter(FWc);
			
			BWa.write("Look before you leap.");
			BWb.write("Make hay while the sun shines");
			
			BWa.flush();
			FWa.close();
			BWb.flush();
			FWb.close();
			
			
			FileReader FRa=new FileReader("C:\\java\\aaa.txt");
			FileReader FRb=new FileReader("C:\\java\\bbb.txt");
			
			BufferedReader BRa=new BufferedReader(FRa);
			BufferedReader BRb=new BufferedReader(FRb);
			
			String str;
			
			while((str=BRa.readLine())!=null)
				{
				System.out.println(str);
				BWc.write(str);
				BWc.newLine();
				}
			
			while((str=BRb.readLine())!=null)
				{
				System.out.println(str);
				BWc.write(str);
				BWc.newLine();
				}
			
			BWc.flush();
			FWc.close();		
			
			FileReader FRc=new FileReader("C:\\java\\ccc.txt");
			BufferedReader BRc=new BufferedReader(FRc);
			
			while((str=BRc.readLine())!=null)
				System.out.println(str);
			
			FRa.close();
			FRb.close();
			FRc.close();
		
		}
}
