package  Chapter20;
import java.awt.*;
import java.awt.event.*;

public class HW05_001 {
	
	static Frame frm=new Frame();
	
	public static void main(String args[])
	{	
		frm.setTitle("Drawing example");
		frm.setSize(200, 150);
		frm.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		System.out.println("paint() called...");
		g.drawRect(100, 50, 70, 55);	
	}
}