package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW07 extends Frame implements ActionListener {
	static HW07 frm=new HW07();
	static Button btn=new Button("Click Me again");
	
	public static void main(String args[])
	{	
		frm.setTitle("Action Event");
		btn.addActionListener(frm);
		frm.setSize(200, 200);
		frm.add(btn);
		
		frm.setVisible(true);
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
//		if(btn.getLabel()=="Click Me")
//		{btn.setLabel("Click Me again");}
//		else
//		{btn.setLabel("Click Me");}
		
		String str=btn.getLabel();
		
		if(str.equals("Click Me"))
			btn.setLabel("Click Me again");
		else
			btn.setLabel("Click Me");
	}	
	
}
