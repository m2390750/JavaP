package Chapter16;
import java.util.*;

public class App16_9 {
	public static void main(String args[])
	{
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Monkey");
		tset.add("Bunny");
		tset.add("Puppy");
		tset.add("Kitty");
		
		System.out.print("TreeSet¤º®e:");
		
		for(String i:tset)
			System.out.print(i+" ");
	}
}
