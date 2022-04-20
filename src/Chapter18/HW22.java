package Chapter18;
import java.awt.event.*;
import java.awt.*;

public class HW22 {
	static Frame frm=new Frame("Action Event");
	static Button btn=new Button("Click me");
//	static WinLis wlis=new WinLis();
//	static class WinLis extends WindowAdapter
//	{
//		public void windowClosing(WindowEvent e)
//		{
//			System.out.println("視窗關閉中");
//			frm.dispose();
//			System.out.println("視窗已關閉");
//		}
//		
//		public void windowClosed(WindowEvent e)
//		{
//			
//		}
//	}
	public static void main(String args[])
	{
		btn.addActionListener(new A888());
		
		
		frm.addWindowListener
		(
				new WindowAdapter()
			{
					
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			}
		);
		
		
//		frm.addWindowListener(wlis);
		frm.setLayout(new FlowLayout());
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);

	}
	
	static class A888 implements ActionListener
	{
		public void actionPerformed(ActionEvent ef)
		{
			if(frm.getBackground()== Color.white)
				frm.setBackground(Color.yellow);
			else
				frm.setBackground(Color.white);
						
		}
	}


}
