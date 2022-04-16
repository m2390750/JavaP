package Chapter16;
import java.util.*;
public class HW12 {
public static void main(String args[]) {
	TreeMap<Integer,Integer> Tmap =new TreeMap<Integer,Integer>();
	
	for(int i=1;i<=5;i++)
	Tmap.put(i,(int)(Math.random()*101));
	
	System.out.println(Tmap);
	int sum=0;
	
	for(int i=1;i<=5;i++)
	    sum+=Tmap.get(i);
	
	System.out.println(sum+"\n"+sum/5.0);
}
}
