package Chapter18;
import java.awt.event.*;
import java.awt.*;

public class HW01 {
	static Frame frm=new Frame("Action Event");
	static Button btn=new Button("Click me");
	
	public static void main(String args[])
	{
		btn.addActionListener(new A888());
		
		frm.setLayout(new FlowLayout());
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);
		System.out.println(frm.getBackground());
	}
	
	static class A888 implements ActionListener
	{
		public void actionPerformed(ActionEvent ef)
		{
			if(frm.getBackground()== Color.white)
				frm.setBackground(Color.yellow);
			else
				frm.setBackground(Color.white);
						
		}
	}

}
