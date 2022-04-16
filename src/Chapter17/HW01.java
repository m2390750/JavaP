package Chapter17;
import java.awt.*;
public class HW01 {
	public static void main(String args[])
	{
		Frame frm=new Frame("My Frame");
		Label lab=new Label("Have a nice day!");
		frm.setBackground(Color.pink);
		frm.setSize(300,100);
		frm.setVisible(true);
		frm.add(lab);
		
	}

}
