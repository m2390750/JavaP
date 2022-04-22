package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_10 extends Frame implements MouseListener,MouseMotionListener{
	static App20_10 frm=new App20_10();
	static int x1,x2,y1,y2;
	
	public static void main(String args[])
	{
		frm.setTitle("Free drawing");
		frm.setSize(200, 150);
		frm.addMouseListener(frm);
		frm.addMouseMotionListener(frm);
		frm.setVisible(true);
	}
	
	public void mousePressed(MouseEvent e)
	{
		x1=e.getX();
		y1=e.getY();
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=getGraphics();
		x2=e.getX();
		y2=e.getY();
		g.drawLine(x1, y1, x2, y2);
		
		x1=x2;
		y1=y2;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
}
