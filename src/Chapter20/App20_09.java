package Chapter20;
import java.awt.*;

public class App20_09 extends Frame{
	
	static App20_09 frm=new App20_09();
	
	public static void main(String args[])
	{
		frm.setTitle("Polygon");
		frm.setSize(200,150);
		frm.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		int x[]= {44,65,97,139,58};
		int y[]= {34,55,40,109,127};
		g.setColor(Color.pink);
		g.fillPolygon(x, y, 5);
		g.setColor(Color.black);
		g.drawPolygon(x,y,5);
	}
}
