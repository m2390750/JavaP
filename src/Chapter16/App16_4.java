package Chapter16;
import java.util.*;
public class App16_4 {
	public static void main(String args[])
	{
		TreeSet<Integer> test=new TreeSet<Integer>();
		for(int i=20;i>=2;i-=2)
			test.add(i);
	
		System.out.println("�����Ӽ�="+test.size());
		System.out.println("�Ĥ@�Ӥ���="+test.first());
		System.out.println("�̫�@�Ӥ���="+test.last());
		System.out.println("����6�M14���������X="+test.subSet(6,14));
		System.out.println("�j�󵥩�10�����X="+test.tailSet(10));
		System.out.println("�p��8�����X="+test.headSet(8));
	}
}
