package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW19 extends Frame{
	static HW19 frm=new HW19();
	static Label lab=new Label();
	static MouseLis mlis=new MouseLis();
	public static void main(String args[])
	{
		frm.setLayout(null);
		
		lab.addMouseListener(mlis);
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
			lab.setAlignment(Label.RIGHT);
			lab.setText("Mouse Entered");
		}
		public void mouseExited(MouseEvent e)
		{
			lab.setAlignment(Label.RIGHT);
			lab.setText("Mouse Exited");
		}
//		public void mouseDragged(MouseEvent e)
//		{
//			lab.setAlignment(Label.RIGHT);
//			lab.setText("Mouse Dragged");
//		}
//		public void mouseMoved(MouseEvent e)
//		{
//			lab.setAlignment(Label.RIGHT);
//			lab.setText("Mouse Moved");
//		}
	}


}

