package Chapter16;
import java.util.*;
public class HW15 {
public static void main(String args[])
{
	LinkedList<Integer> llist=new LinkedList<Integer>();
	
	for(int i=1;i<=10;i++)
	llist.add((int)(Math.random()*100));
	
	System.out.println(llist);
	
	Iterator<Integer> list=llist.iterator();
	
	int a=0;
	int sum=0;
	while(list.hasNext())
	{
	int c=list.next();
	System.out.print(c+" ");
	sum+=c;
	System.out.println(sum);	
	}
	
//	ListIterator<Integer> litr=llist.listIterator(llist.size());
//	System.out.print("反向走訪 LinkedList 內容:");
//	while(litr.hasPrevious())
//	{
//		int elm=litr.previous();
//		System.out.print(elm+" ");
//		sum+=elm;
//	}
//	System.out.println("\nsum="+sum);
}
}


