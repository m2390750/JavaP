package Chapter16;
import java.util.*;
public class HW06 {
public static void main(String args[])
{
	LinkedList<Integer> list = new LinkedList<Integer>();
	for(int i=1;i<=10;i++)
		list.add((int)(Math.random()*101));
	
	System.out.println(list);
	System.out.println(list.get(0));
	System.out.println(list.get(list.size()-1));
	System.out.println(list.get(0)*(list.get(list.size()-1)));
}
}
