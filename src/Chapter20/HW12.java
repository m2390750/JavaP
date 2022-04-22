package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW12 extends Frame{
	static HW12 frm=new HW12();
	static int x=70,y=60,posX=70,posY=60,dx,dy;
	
	public static void main(String args[])
	{
		frm.setTitle("Dragging a circle");frm.setSize(200,150);
		frm.addMouseListener(new mila());frm.addMouseMotionListener(new milb());
		frm.setVisible(true);
	}
	
	static class mila extends MouseAdapter{
		
	public void mousePressed(MouseEvent e)
	{
		dx=e.getX()-posX;
		dy=e.getY()-posY;
	}
	}
	static class milb extends MouseAdapter{
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX()-dx;
		y=e.getY()-dy;
		if(dx>0 && dx<50 && dy>0 && dy<50)
			{
			Graphics g=frm.getGraphics();
			frm.update(g);
			}
	}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.fillOval(x, y, 50, 50);
		posX=x;
		posY=y;
	}


}
