package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW20 extends Frame implements MouseMotionListener{

	private static final long serialVersionUID = 1L;
	static HW20 frm=new HW20();
	static Label lab=new Label();
	static MouseLis mlis=new MouseLis();
	public static void main(String args[])
	{
		frm.setLayout(null);
		
		lab.addMouseListener(mlis);
		lab.addMouseMotionListener(frm);
		lab.setBounds(30,50,140,70);
		lab.setBackground(Color.pink);
		frm.setSize(200, 150);
		frm.setTitle("Mouse Event");
		frm.add(lab);
		frm.setVisible(true);
	}
	
	static class MouseLis extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			lab.setAlignment(Label.CENTER);
			lab.setText("Mouse Entered");
		}
		public void mouseExited(MouseEvent e)
		{
			lab.setAlignment(Label.CENTER);
			lab.setText("Mouse Exited");
		}
	}

	public void mouseDragged(MouseEvent e)
	{
		lab.setAlignment(Label.CENTER);
		lab.setText("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent e)
	{
		lab.setAlignment(Label.CENTER);
		lab.setText("Mouse Moved");
	}


}

