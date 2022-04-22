package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_11 extends Frame implements MouseMotionListener,MouseListener{
	static App20_11 frm=new App20_11();
	int x=70,y=60,posX=70,posY=60,dx,dy;
	
	public static void main(String args[])
	{
		frm.setTitle("Dragging a circle");frm.setSize(200,150);
		frm.addMouseListener(frm);frm.addMouseMotionListener(frm);
		frm.setVisible(true);
	}
	
	public void mousePressed(MouseEvent e)
	{
		dx=e.getX()-posX;
		dy=e.getY()-posY;
	}
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX()-dx;
		y=e.getY()-dy;
		if(dx>0 && dx<50 && dy>0 && dy<50)
			{
			Graphics g=getGraphics();
			update(g);
			}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.fillOval(x, y, 50, 50);
		posX=x;
		posY=y;
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

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
