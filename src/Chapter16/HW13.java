package Chapter16;
import java.util.*;
public class HW13 {
public static void main(String args[])
{
	ArrayList<Integer> a =new ArrayList<Integer>();
	
	for(int i=1;i<=10;i++)
	a.add((int)(Math.random()*101));
	System.out.println(a);
	for(int b:a)
		System.out.print(b+" ");
		
}
}
