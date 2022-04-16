package Chapter16;
import java.util.*;

public class App16_3 {
	public static void main(String args[])
	{
		HashSet<String> hset = new HashSet<String>();
		HashSet<String> hset1 = new HashSet<String>();
		String str1="Puppy";
		String str2="Kitty";
		
		System.out.println("Hash empty: "+hset.isEmpty());
		hset1.add("Monkey");
		hset.add("Monkey");
		hset.add("Bunny");
		hset.add(str1);
		hset.add(str2);
		
		System.out.println("Hash size= "+hset.size());
		System.out.println("Hash empty: "+hset.isEmpty());
		System.out.println("HashSet 內容:"+hset);
		
		hset.remove(str2);
		System.out.println("清除Kitty..., Hash size="+hset.size());
		
		System.out.println("Hash中是否有"+str2+"?"+hset.contains(str2));
		System.out.println(hset.contains("fish"));
		System.out.println(hset.contains("Puppy"));
		System.out.println(hset.containsAll(hset));
		System.out.println(hset.addAll(hset1));
//		hset.remove("Bunny");
//		System.out.println("HashSet內容:"+hset);
//		System.out.println("清除Bunny..., Hash size="+hset.size());
//		hset.clear();
//		System.out.println("清除Hash中所有的物件...");
//		System.out.println("Hash empty: "+hset.isEmpty());
	}
}
