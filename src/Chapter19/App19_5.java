package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class App19_5 {
	static Frame frm=new Frame("Menu Demo");
	static MenuBar mb=new MenuBar();
	static Menu menu1=new Menu("Color");
	static Menu menu2=new Menu("Exit");
	static MenuItem mi1=new MenuItem("Yellow");
	static MenuItem mi2=new MenuItem("Orange");
	static MenuItem mi3=new MenuItem("Pink");
	
	static MenuItem mi4=new MenuItem("Close Window");
	
	public static void main(String args[])
	{
		mb.add(menu1);
		mb.add(menu2);
		frm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
		menu1.add(mi1);
		menu1.add(mi2);
		menu1.add(mi3);
		menu2.add(mi4);
		
		frm.setMenuBar(mb);
		frm.setSize(200,150);
		frm.setVisible(true);
	}
}
