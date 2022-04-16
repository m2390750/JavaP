package Chapter15;

class CTest3 implements Runnable
{
private String id;
public CTest3(String str)
 {
 id=str;
 }
 public void run()
 {
 for(int i=1;i<=5;i++)
 {
 for(int j=0;j<100000000;j++);
 System.out.println(id+" "+i);
 }
 }
 }

 public class HW12
 {
 public static void main(String args[])
 {
 CTest3 hi=new CTest3("Hello");
 CTest3 bye=new CTest3("Good bye");
 CTest3 morning=new CTest3("Good morning");
 CTest3 night=new CTest3("Good night");
 

 Thread t1=new Thread(hi);
 Thread t2=new Thread(bye);
 Thread t3=new Thread(morning);
 Thread t4=new Thread(night);
// t1.setPriority(1);
// t2.setPriority(3);
// t3.setPriority(5);
// t4.setPriority(7);

 
 t1.start();
try {
	 t1.join();
	 t2.start();
	 t2.join();
	 t3.start();
	 t3.join();
	 t4.start();
	 t4.join();
 }
catch(InterruptedException e) {}
System.out.println("All Threads are finished");
 }
 }
