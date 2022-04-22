package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_10 extends Frame implements MouseMotionListener
{
	static App18_10 frm=new App18_10();
	static Label labx=new Label();
	static Label laby=new Label();
	static Label lab=new Label();
	
	public static void main(String args[])
	{
		
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		frm.setLayout(null);
		frm.addMouseMotionListener(frm);
		
		labx.setBounds(40, 40, 40, 20);
		laby.setBounds(100, 40, 40, 20);
		
		lab.setBounds(40, 80, 100, 40);
		
		frm.setSize(200, 150);
		frm.setTitle("Mouse Event");
		frm.add(labx);
		frm.add(laby);
		frm.add(lab);
		frm.setVisible(true);
	}
	public void mouseMoved(MouseEvent e)
	{
		labx.setText("x="+e.getX());
		laby.setText("y="+e.getY());
		lab.setText("Mouse moved!!");
	}
	public void mouseDragged(MouseEvent e)
	{
		labx.setText("x="+e.getX());
		laby.setText("y="+e.getY());
		lab.setText("Mouse Dragged!!");
	}
}
