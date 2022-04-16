package Chapter16;
import java.util.*;
public class HW07 {
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("guava");
		System.out.println(list);
		
		ArrayList<String> Alist= new ArrayList<String>();
		Alist.add("tomato");Alist.add("apple");
		Alist.add("papaya");Alist.add("grapte");
		
		Alist.addAll(list);
		System.out.println(Alist);
		
		System.out.println(Alist.get(0)+"\n"+Alist.get(Alist.size()-1));
		System.out.println(Alist.indexOf("apple")+"\n"+Alist.lastIndexOf("apple"));
}
}
