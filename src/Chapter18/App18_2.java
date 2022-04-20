package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_2 extends Frame implements ActionListener {
		static App18_2 frm=new App18_2();
		static Button btn=new Button("Click Me");
		
	public static void main(String args[])
	{
		btn.addActionListener(frm);
		frm.setLayout(new FlowLayout());
		frm.setTitle("Action Event");
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent eef)
	{
		frm.setBackground(Color.yellow);
	}
}
