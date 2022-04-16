package Chapter17;
import java.awt.*;
public class HW19 {
	
	static Frame frm=new Frame("Border Layout");
	
	public static void main(String args[])
	{
		BorderLayout border=new BorderLayout(10,1);
		frm.setLayout(border);
		frm.setSize(200,150);
		
		frm.add(new Button("East"),border.EAST);
		
		frm.add(new Button("West"),border.WEST);
		frm.add(new Button("North"),border.NORTH);
		frm.add(new Button("South"),border.SOUTH);
		
		frm.setVisible(true);
	}
}
