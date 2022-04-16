package Chapter9;

class CRational
{
	public double n;//分子NUMERTOR
	public double d;//分母
	public void setN(int num)
	{
		n=num;
	}
	public void setD(int num)
	{
		d=num;
	}
//	public void show()
//	{
//		System.out.println(n+"/"+d);
//	}
	public void setND(int num,int den)
	{
	n=num;
	d=den;
	System.out.println(n+"/"+d);
	}
	public CRational add(CRational r)
	{
		CRational obj=new CRational();
		obj.n=this.n*r.d+this.d*r.n;
		obj.d=this.d*r.d;
		return obj;
	}
	public CRational sub(CRational r)
	{
		CRational obj=new CRational();
		obj.n=this.n*r.d-this.d*r.n;
		obj.d=this.d*r.d;
		return obj;
	}
	public CRational mul(CRational r)
	{
		CRational obj=new CRational();
		obj.n=this.n*r.n;
		obj.d=this.d*r.d;
		return obj;
	}
	public CRational div(CRational r)
	{
		CRational obj=new CRational();
		obj.n=this.n*r.d;
		obj.d=this.d*r.n;
		return obj;
	}
	public CRational compare(CRational r1,CRational r2)
	{
		if ((r1.n/r1.d) > (r2.n/r2.d))
			return r1;
		else
			return r2;
	}
	public boolean larger(CRational r)
	{
		if (this.n/this.d>r.n/r.d)
			return true;
		
		else
			return false;
	}
}
public class HW9_10_11_12 {

	public static void main(String args[])
	{
		CRational aaa=new CRational();
		CRational bbb=new CRational();
		aaa.setN(2);
		aaa.setD(5);
//		aaa.show();
		bbb.setND(1,5);
		show(aaa);
		show(aaa.add(bbb));
		show(aaa.sub(bbb));
		show(aaa.mul(bbb));
		show(aaa.div(bbb));
		
		CRational obj=new CRational();
		obj=obj.compare(aaa,bbb);
				
		if(obj==aaa)
			{System.out.println("radius of aaa is larger");
			show(aaa);
			show(bbb);
			show(obj);}
		else
			{System.out.println("radius of bbb is larger");
			show(aaa);
			show(bbb);
			show(obj);}
		System.out.println(bbb.larger(bbb));
		
	}
	static void show(CRational obj)//變為內部函數
	{
		System.out.println(obj.n+"/"+obj.d);
	}
}
