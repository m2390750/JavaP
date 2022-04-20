package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App8_12 extends Frame {
	static App8_12 frm=new App8_12();
	static WinLis wils=new WinLis();
	
	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setTitle("Window Event");
		frm.addWindowListener(wils);
		frm.setVisible(true);
	}
	
	static class WinLis extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("windowClosing() called");
			System.out.println("Closing window...");
			frm.dispose();
			System.out.println("window closed...");
		}
		public void windowClosed(WindowEvent e)
		{System.out.println("windowClosed() called");}
		public void windowDeactivated(WindowEvent e)
		{System.out.println("windowDeactivated() called");}
		public void windowActivated(WindowEvent e)
		{System.out.println("windowActivated() called");}
		public void windowDeiconified(WindowEvent e)
		{System.out.println("windowDeiconified() called");}
		public void windowIconified(WindowEvent e)
		{System.out.println("windowIconified() called");}
		public void windowOpened(WindowEvent e)
		{System.out.println("windowOpened() called");}
	}
}
