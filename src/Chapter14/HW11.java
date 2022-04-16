package Chapter14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class HW11{
	public static void main(String args[])throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\java\\number.txt");
		byte data[]=new byte[fi.available()];//不知道實際大小,讀取fi的byte數量 建立char矩陣
		int count=0;
		
		fi.read(data);//寫入fi的資料到data裡面
		String str=new String(data);//將byte轉換為String儲存
		System.out.println(str);
		
		char arr[]=str.toCharArray();//參考聖經指令 建立str的arr char矩陣
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)//計算跳了多少行\n代表知道他總共有幾行

		if(arr[i]=='\n')
		count++;
		
		System.out.println((count+1)+" lines read");
		fi.close();
		}
		}
