package Chapter16;
import java.util.*;
public class HW14 {
	public static void main(String args[])
 {
 int sum=0;
 TreeSet<Integer> tset=new TreeSet<Integer>();
 for(int i=1;i<=10;i++)
 tset.add((int)(Math.random()*100));
 System.out.println(tset.size());
 System.out.println("TreeSet ���X���e:");
 for(int i:tset)
 {
 System.out.print(i+" ");
 sum+=i;
 }
 System.out.println("\n ������="+(double)sum/tset.size());
 }
 }
