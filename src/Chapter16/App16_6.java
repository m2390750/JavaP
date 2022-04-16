package Chapter16;
import java.util.*;

public class App16_6 {
	public static void main(String args[]) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		for(int i=10;i<=50;i+=10)
			alist.add(i);
		alist.add(3,200);
		alist.add(0,300);
		alist.add(400);
		System.out.println(alist);
		
		System.out.println(alist.size());
		alist.add(1,200);
		System.out.println(alist);
		
		System.out.println(alist.indexOf(200));
		System.out.println(alist.lastIndexOf(200));
		System.out.println(alist.get(7));
	}
}
