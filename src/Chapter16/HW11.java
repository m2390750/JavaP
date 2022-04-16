package Chapter16;
import java.util.*;

public class HW11 {
	public static void main(String args[])
	{
		TreeMap<Integer,String> Tmap =new TreeMap<Integer,String>();
		Tmap.put(325,"apple");
		Tmap.put(594,"cherry");
		Tmap.put(37,"pineapple");
		Tmap.put(158,"mango");
		Tmap.put(114,"tomato");
		System.out.println(Tmap);
		
//		Collection<Integer> max=Tmap.values();
//		int min=Tmap.values(0);
		
				
		System.out.println(Tmap.firstKey());
		System.out.println(Tmap.lastKey());
		System.out.println("最貴的水果為"+Tmap.get(Tmap.firstKey()));
		System.out.println("最便宜的水果為"+Tmap.get(Tmap.lastKey()));
		System.out.println("最便宜的水果為"+Tmap.get(594));
	}
}
