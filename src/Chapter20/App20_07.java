package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_07 extends Frame implements ItemListener 
{
	static App20_07 frm=new App20_07();
	static List lst=new List();
	String str="Arial";
	
	public static void main(String args[])
	{
		BorderLayout br=new BorderLayout();
		frm.add(lst,br.NORTH);frm.setBackground(Color.yellow);
		frm.setTitle("Font List");lst.addItemListener(frm);
		frm.setSize(300,150);
		/*
		建立GraphicsEnvironment的物件ge.
		並以它來取得系統裡所提供的字型
		*/
		GraphicsEnvironment ge;
		ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		String fnt[]=ge.getAvailableFontFamilyNames();
		
		for(int i=0;i<fnt.length;i++)
			lst.add(fnt[i]);
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		str=lst.getSelectedItem();
		Graphics g=getGraphics();
		update(g);
	}
	
	public void paint(Graphics g)
	{
		g.setFont(new Font(str,Font.PLAIN,20));
		g.setColor(Color.black);
		g.drawString(str, 20, 110);
	}
}
