package Chapter19;
import java.awt.*;
public class App19_1 extends Frame{
	static App19_1 frm=new App19_1();
	static List lst=new List();
	
	public static void main(String args[])
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,100,130));
		frm.setTitle("List class");
		
		for(int i=0;i<=9;i++)
			lst.add("List 18item" +i);
		lst.select(2);
		
		frm.setSize(200,150);
		frm.add(lst);
		frm.setBackground(Color.yellow);
		frm.setVisible(true);
		System.out.println("lst.getRows()= "+lst.getRows());
		System.out.println("lsg.getItemCount()= "+lst.getItemCount());
	}
}
