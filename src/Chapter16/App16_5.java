package Chapter16;
import java.util.*;
public class App16_5 {
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		for (int i=10;i<=30;i+=10)
			list.add(i);
		list.addFirst(100);
		list.addLast(200);
		list.addFirst(300);
		
		System.out.println("元素個數="+list.size());
		System.out.print("LinkedList的元素:");
		for(int i=0;i<list.size();i++)//顯示集合物件的內容
			System.out.print(list.get(i)+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.print("\n刪除最後一個元素");
		System.out.println(list.remove()+"...");
		
		System.out.println("第一個元素="+list.getFirst());
		System.out.println("最後一個元素="+list.getLast());
		System.out.println("員素質為兩百的索引直="+list.indexOf(200));
	}
}
