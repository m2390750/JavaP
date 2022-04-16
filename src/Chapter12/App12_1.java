package Chapter12;

public class App12_1 {
	public static void main(String args[])
	{
		String str;//建立一個string字串
		str="abc";
		System.out.print(str);
		
		char data[]= {'a','b','c'};
		String str1=new String(data);
		String str2=new String("abc");
		System.out.print(str1);
		System.out.print(str2);
			
		String str3="Easier said than done.";
		System.out.println("length="+str3.length());
		System.out.println("charAt(8)="+str3.charAt(8));
		System.out.println("sub string="+str3.substring(7));
		System.out.println("start with \"th\"="+str3.startsWith("th"));
		System.out.println("start with \"Easi\"="+str3.startsWith("Easi"));
		System.out.println("upper case="+str3.toUpperCase());
		
		StringBuffer str4=new StringBuffer("Black & White");
		System.out.println(str4);
		System.out.println("length="+str4.length());
		System.out.println(str4.replace(0, 5,"cats"));
		System.out.println(str4.replace(7,12,"dogs"));
		System.out.println(str4);
		System.out.println(str4.reverse());
		System.out.println(str4);
		System.out.println(str4.insert(11,"dogs"));
		}
}
