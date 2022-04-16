package Chapter16;
import java.util.*;
public class HW09 {
	public static void main(String args[])
	{
	HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	TreeSet<Integer> Tset=new TreeSet<Integer>();
	HashSet<Integer> Hset=new HashSet<Integer>();
	
	
	for(int i=0;i<5;i++)
		{hmap.put(i,((int)(Math.random()*101)));
		
		Tset.addAll(hmap.values());
		Hset.addAll(hmap.keySet());
		}
	System.out.println(hmap);
	System.out.println(Tset);
	System.out.println(Hset);
	
	
	
	}
}
