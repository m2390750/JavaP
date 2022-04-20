package Chapter19;
import java.awt.*;
import java.awt.event.*;

public class App19_2 extends Frame implements ItemListener {
	static App19_2 frm = new App19_2();
	static List lst=new List();
	
	
	public static void main(String args[])
		{
			frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,25));
			frm.setTitle("Select a color");
			frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
			lst.add("yellow");
			lst.add("orange");
			lst.add("pink");
			lst.add("cyan");
			lst.select(0);
			lst.addItemListener(frm);
			frm.add(lst);
			frm.setSize(200,150);
			frm.setVisible(true);
		}
	public void itemStateChanged(ItemEvent e)
	{
		String color=lst.getSelectedItem();
		if(color=="yellow")
			frm.setBackground(Color.yellow);
		
		else if (color=="orange")
			frm.setBackground(Color.orange);
		
		else if (color=="pink")
			frm.setBackground(Color.pink);
		
		else if (color=="cyan")
			frm.setBackground(Color.cyan);
	}
}
