package Chapter3;

import java.util.Scanner;

public class App3_6 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("What's your name? ");
		name=scn.nextLine();
		System.out.println("How old are you?");
		age=scn.nextInt();
		
		System.out.println("Hi,"+name+", you're");
		System.out.println(age+" years old.");
	}

}
