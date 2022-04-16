package Chapter9;
class Data
{
	
	private  String name;
	private Test score;
	

	public Data(String a,int b,int c)
	{
		name=a;
		score=new Test(b,c);
	}
	void show()
	{
		System.out.print(name+"\n"+score.english+"\n"+score.math+"\n"+score.avg());
	}
//	double avg()
//	{
//		return (score.english+score.math)/2.0;
//	}
	class Test
	{
		int english;
		int math;
		
		public Test(int eng,int m)
		{
			english = eng;
			math = m;
		}
		double avg()
		{
			return (english+math)/2.0;
		}
		
	}
}

public class HW9_19 {
	public static void main(String args[])
	{
		Data stu=new Data("Annie",85,92);
		stu.show();
	}
}
