package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class HW08 extends Frame implements ActionListener{
	static HW08 frm=new HW08();
	static MenuBar mb=new MenuBar();
	static Menu menu1=new Menu("Color");
	static Menu menu2=new Menu("Exit");
	static MenuItem mi1=new MenuItem("Yellow");
	static MenuItem mi2=new MenuItem("Orange");
	static MenuItem mi3=new MenuItem("Pink");
	
	static MenuItem mi4=new MenuItem("Close Window");
	
	public static void main(String args[])
	{	
		frm.setTitle("Menu Demo");
		frm.setSize(200,150);
		mb.add(menu1);
		mb.add(menu2);
		frm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
		menu1.add(mi1);
		menu1.add(mi2);
		menu1.add(mi3);
		menu2.add(mi4);
		mi1.addActionListener(frm);
		mi2.addActionListener(frm);
		mi3.addActionListener(frm);
		mi4.addActionListener(frm);
		
		frm.setMenuBar(mb);
		
		frm.setVisible(true);
	}
		public void actionPerformed(ActionEvent e)
		{
			MenuItem mi=(MenuItem) e.getSource();
			if(mi==mi1)
				frm.setBackground(Color.yellow);
			else if(mi==mi2)
				frm.setBackground(Color.orange);
			else if(mi==mi3)
				frm.setBackground(Color.pink);
			else if(mi==mi4)
				System.exit(0);
		}
	}




