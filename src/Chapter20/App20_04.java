package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_04 extends Frame{
	static App20_04 frm=new App20_04();
	
	public static void main(String args[])
	{
	frm.addWindowListener(new WindowAdapter() 
	{public void windowClosing(WindowEvent e) {System.exit(0);}});
		
		frm.setTitle("Drawing Example");
		frm.setSize(200, 150);
		frm.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setFont(new Font("Airal",Font.ITALIC,18));
		g.drawString("Live and learn.", 45, 95);
		g.setColor(Color.red);
		g.drawRect(30, 65, 145, 30);
	}
}
