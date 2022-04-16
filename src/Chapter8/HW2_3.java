package Chapter8;

class Cbbb{
	double x;
	double y;
}

class Cddd{
	String name;
	double height;
	double weight;
}
public class HW2_3 {
	public static void main(String args[]) {
	Cbbb obj1=new Cbbb();
	Cbbb obj2=new Cbbb();
	Cbbb avg=new Cbbb();
	
	obj1.x=5.2;
	obj1.y=3.9;
	obj2.x=6.5;
	obj2.y=4.6;
	avg.x=obj1.x/2+obj2.x/2;
	avg.y=obj1.y/2+obj2.y/2;
	System.out.println(obj1.x+" "+obj1.y);
	System.out.println(obj2.x+" "+obj2.y);
	System.out.println(avg.x+" "+avg.y);
	
	Cddd Student = new Cddd();
	Student.name="Sandy";
	Student.height=165.5;
	Student.weight=58.2;
	double bmi=Student.weight/((Student.height/100)*(Student.height/100)); 
	System.out.println(Student.name+"\n"+Student.height+"\n"+Student.weight+"\n"+bmi);
	}
}
