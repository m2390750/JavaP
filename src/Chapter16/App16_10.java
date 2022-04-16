package Chapter16;
import java.util.*;

public class App16_10 {
	public static void main(String args[])
	{
		TreeSet<String> tset=new TreeSet<String>();
		String str="";
		tset.add("Monkey");
		tset.add("Bunny");
		tset.add("Puppy");	
		tset.add("Kitty");
		
		Iterator<String> itr=tset.iterator();
		System.out.print("TreeSet內容:");
		
		while(itr.hasNext())
		{
			str=itr.next();
			System.out.print(str+" ");
		}
		
		System.out.println("\n刪除最後讀取的元素"+str+"...");
		itr.remove();
		System.out.println("TreeSet內容:"+tset);
	}
}
