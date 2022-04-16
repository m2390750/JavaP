package Chapter16;
import java.util.*;
public class HW05 {
public static void main(String args[]) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Everything has an end.");
		tset.add("Good to begin well,better to end well.");
		tset.add("You cannot tell a book by its cover.");
		tset.add("A good book is a light to the soul.");
		
	System.out.println(tset.first());
	System.out.println(tset.last());
	
	System.out.println(tset.headSet("End"));
}
}
