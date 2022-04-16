package Chapter16;
import java.util.*;

public class HW04 {
	public static void main(String args[])
	{
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(65);hset.add(29);hset.add(18);hset.add(34);
		System.out.println(hset);
		TreeSet<Integer> test = new TreeSet<Integer>();
		test.add(97);test.add(62);test.add(53);
		System.out.println(test);
		test.addAll(hset);
		
		System.out.println(test);
		int sum=0;
		
		sum=test.first()+test.last();
		System.out.print(sum/2.0);
	}
}
