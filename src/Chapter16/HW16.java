package Chapter16;
import java.util.*;

public class HW16 {
	public static void main(String args[])
	{
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Sunday");alist.add("Monday");alist.add("Tuesday");
		alist.add("Wednesday");alist.add("Thursday");alist.add("Friday");
		alist.add("Saturday");alist.add("²Ä¤K¤Ñ");
		
		ListIterator<String> plist=alist.listIterator();
		ListIterator<String> nlist=alist.listIterator(alist.size());
		
		
		while(plist.hasNext())
		{
			String a=plist.next();
			System.out.println(a);
		}
		while(nlist.hasPrevious())
		{
			String b=nlist.previous();
			System.out.println(b);
		}
	}
}
