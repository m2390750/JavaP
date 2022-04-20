package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_9 extends Frame implements MouseListener 
{
	static App18_9 frm=new App18_9();
	static Button btn=new Button(" Click Me!! ");
	static TextArea txa=new TextArea("",2,5,TextArea.SCROLLBARS_NONE);
			
	public static void main(String args[])
	{
		BorderLayout br=new BorderLayout(2,5);
		frm.setSize(200,150);
		frm.setTitle("Mouse Event");
		frm.setLayout(br);
		
		btn.addMouseListener(frm);
		
		txa.setEditable(false);
		frm.add(btn,br.WEST);
		frm.add(txa,br.CENTER);
		frm.setVisible(true);
	}
	
	public void mouseEntered(MouseEvent e)
	{txa.setText("Mouse entered\n");}
	public void mouseClicked(MouseEvent e)
	{txa.setText("Mouse clicked\n");}	
	public void mouseExited(MouseEvent e)
	{txa.setText("Mouse exited\n");}
	public void mousePressed(MouseEvent e)
	{txa.setText("Mouse pressed\n");}
	public void mouseReleased(MouseEvent e)
	{txa.setText("Mouse released\n");}
}
