package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_11 extends Frame 
{
	static App18_11 frm=new App18_11();
	static Button btn=new Button(" Click Me!!");
	static TextArea txa=new TextArea("",2,5,TextArea.SCROLLBARS_NONE);
	static MM mils=new MM();
	
	public static void main(String args[])
	{
		BorderLayout br=new BorderLayout(2,5);
		frm.setSize(200,150);
		frm.setTitle("MouseEvent");
		frm.setLayout(br);
		
		btn.addMouseListener(mils);
		txa.setEditable(false);
		frm.add(btn,br.WEST);
		frm.add(txa,br.CENTER);
		frm.setVisible(true);
		System.out.println(frm.getBackground());
	}
	static class MM extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			int x=e.getX();
			int y=e.getY();
			txa.append("clicked at ("+x+","+y+")\n");
		}
	}
	
}
