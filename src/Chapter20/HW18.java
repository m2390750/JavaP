package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW18 extends Frame{
static HW18 frm=new HW18();

public static void main(String args[])
{
	frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
	frm.setSize(250, 180);
	frm.setVisible(true);
}
public void paint(Graphics gr)
{
	int r,g,b;
	for(int i=1;i<=9;i++)
	{
		r=(int)(Math.random()*255);
		g=(int)(Math.random()*255);
		b=(int)(Math.random()*255);
		gr.setColor(new Color(r,g,b));
		gr.fillOval((i)*20, 80+20*(i%2), 15, 15);
	}
}
}
