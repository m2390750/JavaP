package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW19 extends Frame implements MouseMotionListener,MouseListener{
	static HW19 frm=new HW19();
	int x1,x2,y1,y2;
	boolean pressed=false;
	boolean dragged=false;
	
	Point start;
	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.addMouseListener(frm);
		frm.addMouseMotionListener(frm);
		frm.setVisible(true);
	}
	public void mousePressed(MouseEvent e)
	{
		pressed=true;
		start=e.getPoint();
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=getGraphics();
		if(pressed&& !dragged)
		{
			g.setColor(Color.blue);
			x2=e.getX();
			y2=e.getY();
			g.drawLine(start.x,start.y, x2, y2);
		}
		dragged=true;
		if(pressed&&dragged)
		{
			g.setColor(getBackground());
			g.drawLine(start.x, start.y, x1, y1);//舊座標改為背景顏色
			g.setColor(Color.blue);
			x2=e.getX();
			y2=e.getY();
			g.drawLine(start.x, start.y, x2, y2);//畫出新的線
			x1=x2;
			y1=y2;
		}
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
