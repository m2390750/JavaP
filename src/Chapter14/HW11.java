package Chapter14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class HW11{
	public static void main(String args[])throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\java\\number.txt");
		byte data[]=new byte[fi.available()];//�����D��ڤj�p,Ū��fi��byte�ƶq �إ�char�x�}
		int count=0;
		
		fi.read(data);//�g�Jfi����ƨ�data�̭�
		String str=new String(data);//�Nbyte�ഫ��String�x�s
		System.out.println(str);
		
		char arr[]=str.toCharArray();//�ѦҸt�g���O �إ�str��arr char�x�}
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)//�p����F�h�֦�\n�N���D�L�`�@���X��

		if(arr[i]=='\n')
		count++;
		
		System.out.println((count+1)+" lines read");
		fi.close();
		}
		}
