package Chapter20;
import java.awt.*;
public class HW15 extends Frame{
	
	static HW15 frm=new HW15();
	
	public static void main(String args[])
	{
		frm.setTitle("Polygon");
		frm.setSize(200,150);
		frm.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		int x[]= {40,60,80};
		int y[]= {60,40,80};
		int a[]= {80,120,100};
		int b[]= {80,100,120};
		g.fillPolygon(x,y,3);
		g.fillPolygon(a,b,3);
//		g.drawPolygon(a,b,3);
	}
}
