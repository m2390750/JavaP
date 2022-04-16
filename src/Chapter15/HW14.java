package Chapter15;

import java.util.Random;

class PrePaid extends Thread
{
	public static int sum=200;
	private static int coin;
	private int fee;
	public void run()
	{
		fee=(int)(100*Math.random());
	
		if(sum>10)
			this.talk(fee);
		
	}
	public synchronized static void talk(int a)
	{
		coin=sum-a;
		System.out.println("此次通話費為: "+a+"餘額為"+coin);
		
		try {sleep((int)(1000*Math.random()));}
		catch(InterruptedException e) {}
		
		if((sum-coin)>0)
		sum=coin;
	}
}
public class HW14 {
	public static void main(String args[])
	{
		PrePaid a=new PrePaid();
		PrePaid b=new PrePaid();
		PrePaid c=new PrePaid();
		a.start();
		b.start();
		c.start();
	}
}
