package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class App19_4 extends Frame implements ItemListener{
	static App19_4 frm=new App19_4();
	static Choice chc=new Choice();
	
	public static void main(String args[])
	{	
		BorderLayout br=new BorderLayout();
		frm.setLayout(br);
		frm.setTitle("Select a color");
		chc.add("Yellow");
		chc.add("Orange");
		chc.add("pink");
		chc.add("cyan");
		
		chc.addItemListener(frm);
		frm.setSize(200,150);
		frm.add(chc,br.NORTH);
		frm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String color=chc.getSelectedItem();
		if(color=="Yellow")
			frm.setBackground(Color.yellow);
		
		else if (color=="Orange")
			frm.setBackground(Color.orange);
		
		else if (color=="pink")
			frm.setBackground(Color.pink);
		
		else if (color=="cyan")
			frm.setBackground(Color.cyan);
	}
}
