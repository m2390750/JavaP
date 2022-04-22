package Chapter21;
import java.awt.*;
import java.applet.*;
public class App01 extends Applet {
	
	public void paint(Graphics g)
	{
	g.setColor(Color.blue);
	g.fillOval(30, 30, 50, 50);
	g.setColor(Color.orange);
	g.fillOval(60, 40, 90, 90);
	}
	
}
