package Chapter17;
import java.awt.*;

public class HW10 {
	
	static Frame frm=new Frame();
	static Button but=new Button("My button");
	
	public static void main(String args[])
	{
		frm.setLayout(null);
		frm.setSize(200,150);
		but.setSize(80, 40);
		but.setLocation(50,60);
		
		frm.add(but);
		frm.setVisible(true);	
	}
}
