package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW04 {
	static Frame frm=new Frame("New Frame");
	static Label lab=new Label("Time files!");
	static Button btn=new Button("pink");
	
	public static void main(String args[])
	{
		btn.addActionListener(new ActLis());
		frm.setLayout(new FlowLayout());
		frm.setSize(200, 150);
		frm.setBackground(Color.yellow);
		lab.setBackground(Color.pink);
		
		frm.add(btn);
		frm.add(lab);
		frm.setVisible(true);
	}
	static class ActLis implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(lab.getBackground()==Color.pink)
			{
				lab.setBackground(Color.white);
				btn.setLabel("white");
			}
			else
			{
				lab.setBackground(Color.pink);
				btn.setLabel("pink");
			}
		}
	}
}
