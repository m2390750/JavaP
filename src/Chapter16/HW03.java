package Chapter16;
import java.util.*;
public class HW03 {

	public static void main(String args[])
	{
		HashSet<Integer> hset=new HashSet<Integer>();
		
		hset.add(36);
		hset.add(15);
		System.out.println(hset);
		
		
		TreeSet<Integer> Tset=new TreeSet<Integer>();
		Tset.add(52);Tset.add(23);Tset.add(32);Tset.add(69);
		Tset.add(10);Tset.add(7);Tset.add(36);Tset.add(15);
		System.out.println(Tset);
		
		if(Tset.contains(32))
			Tset.remove(32);
		else
			System.out.println("test中沒有元素32");
		
		System.out.println(Tset.containsAll(hset));
		System.out.println(Tset);
	}
}
