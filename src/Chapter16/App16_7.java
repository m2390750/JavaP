package Chapter16;
import java.util.*;
public class App16_7 {
	public static void main(String args[])
	{
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		hmap.put(94001,"Fiona");
		hmap.put(94003,"Ariel");
		hmap.put(94002,"Ryan");
		
		System.out.println("元素個數="+hmap.size());
		System.out.println("HashMap的元素:"+hmap);
		System.out.println(hmap.containsKey(94002));
		
		System.out.println(hmap.containsValue("Kevin"));
		hmap.remove(94001);
		
		System.out.println(hmap.size());
		System.out.println(hmap);
		System.out.println(hmap.get(94003));
	}
}
