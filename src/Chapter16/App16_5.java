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
		
		System.out.println("�����Ӽ�="+list.size());
		System.out.print("LinkedList������:");
		for(int i=0;i<list.size();i++)//��ܶ��X���󪺤��e
			System.out.print(list.get(i)+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.print("\n�R���̫�@�Ӥ���");
		System.out.println(list.remove()+"...");
		
		System.out.println("�Ĥ@�Ӥ���="+list.getFirst());
		System.out.println("�̫�@�Ӥ���="+list.getLast());
		System.out.println("�����謰��ʪ����ު�="+list.indexOf(200));
	}
}
