package Chapter6;

public class HW6_7 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,-20,-40,60,80,51,551735,8768,541,661,-4566};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
			{
			if(a[i]>max)
			max=a[i];
			
			else if(a[i]<min)
			min=a[i];
			}
		System.out.println("�̤j�Ȭ�"+max);
		System.out.println("�̤p�Ȭ�"+min);
		System.out.println("�̤j�P�̤p���t�Ȭ�: "+(max-min));
	}
}
