package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW14 extends Frame implements ItemListener,MouseListener,MouseMotionListener{
	static HW14 frm=new HW14();
	static int x1,x2,y1,y2;
	static Choice chc=new Choice();
	Color co;
	public static void main(String args[])
	{	frm.setLayout(new FlowLayout());
		frm.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		
		frm.setTitle("Free drawing");
		frm.setSize(200, 150);
		
		chc.add("Red");chc.add("Green");chc.add("Blue");
		chc.add("Black");chc.add("Pink");
		
		chc.addItemListener(frm);
		frm.addMouseListener(frm);
		frm.addMouseMotionListener(frm);
		frm.add(chc);
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String color=chc.getSelectedItem();
		if(color=="Red")
		{co=Color.red;}
		else if(color=="Green")
		{co=Color.green;}
		else if(color=="Blue")
		{co=Color.blue;}
		else if(color=="Black")
		{co=Color.black;}
		else if(color=="Pink")
		{co=Color.pink;}
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
		g.setColor(co);
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
