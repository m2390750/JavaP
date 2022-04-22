package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW11 extends Frame {
	static HW11 frm=new HW11();
	static int x1,x2,y1,y2;
	
	public static void main(String args[])
	{
		frm.setTitle("Free drawing");
		frm.setSize(200, 150);
		frm.addMouseListener(new milp());
		frm.addMouseMotionListener(new mild());
		frm.setVisible(true);
	}
	static class milp extends MouseAdapter{
	
		public void mousePressed(MouseEvent e)
	{
		x1=e.getX();
		y1=e.getY();
	}
	}
	static class mild extends MouseAdapter{
	public void mouseDragged(MouseEvent e)
	{
	Graphics g=frm.getGraphics();
		x2=e.getX();
		y2=e.getY();
		g.drawLine(x1, y1, x2, y2);
		
		x1=x2;
		y1=y2;
	}
	}
}
	

