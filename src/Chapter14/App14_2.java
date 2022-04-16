package Chapter14;
import java.io.*;
public class App14_2 {
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("C:\\java\\write.txt");
		char data[]= {'T','i','m','e',' ','f','l','i','e','s','!','\r','\n'};
		String str="End of file";
		fw.write(data);
		fw.write(str);
		fw.close();
	}
}
