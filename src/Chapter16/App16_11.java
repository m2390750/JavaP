package Chapter16;
import java.util.*;
public class App16_11 {
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(5);
		list.add(7);
		list.add(10);
		list.add(14);
		
		ListIterator<Integer> litr=list.listIterator();
		
		while(litr.hasNext())
			System.out.print(litr.next()+" ");
		
		System.out.println();
		
		ListIterator<Integer> litr2=list.listIterator(4);
		System.out.print("反向列出LinkedList內容:");
		while(litr2.hasPrevious())
			System.out.print(litr2.previous()+" ");
		System.out.println();
	}
}
