package Chapter16;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
public class HW10 {
	public static void main(String args[])
	{
	TreeMap<Integer,Integer> Tmap=new TreeMap<Integer,Integer>();
	
	for(int i=0;i<5;i++)
	{Tmap.put(i,((int)(Math.random()*101)));}
	
	HashSet<Integer> hset=new HashSet<Integer>();
	
	System.out.println(Tmap.keySet());
	int key=0;
	while(key<=100)
	{
		if(Tmap.containsValue(key))
			hset.add(key);
		
		key++;
	}
	System.out.println(Tmap);
	System.out.println(hset);
	}
}