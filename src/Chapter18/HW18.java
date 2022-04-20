package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW18 extends Frame implements MouseListener ,MouseMotionListener
{
	static HW18 frm=new HW18();
	static Button btn=new Button(" DRAG Me!! ");
	static int x,y,posX=20,posY=40,dx,dy;
			
	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setTitle("Mouse Event");
		
		frm.setLayout(null);
		frm.setBackground(Color.yellow);
		
		btn.setBounds(posX, posY, 80, 35);
		btn.addMouseListener(frm);
		btn.addMouseMotionListener(frm);
		frm.add(btn);
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
//		x=e.getX();
//		y=e.getY();
		posX=posX+x;
		posY=posY+y;
		btn.setLocation(posX,posY);
	}
	public void mouseMoved(MouseEvent e) 
	{	
		posX=x;
		posY=y;
	}
	
	
	public void mouseEntered(MouseEvent e)
	{}
	public void mouseClicked(MouseEvent e)
	{}	
	public void mouseExited(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
}
