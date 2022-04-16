package Chapter17;
import java.awt.*;
public class HW12 {
	static Frame frm=new Frame();
	static Button but=new Button("OK");
	static Button but1=new Button("Cancel");
	public static void main(String args[])
	{
		frm.setLayout(null);
		frm.setSize(290,200);
		
		but.setLocation(50, 50);
		but.setSize(60, 30);
		but1.setLocation(130, 50);
		but1.setSize(60, 30);
		
		frm.add(but);
		frm.add(but1);
		
		
		frm.setVisible(true);
	}
}
