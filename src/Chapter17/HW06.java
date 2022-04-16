package Chapter17;
import java.awt.*;

public class HW06 {
	public static void main(String args[])
	{
		Frame frm=new Frame("My Frame");
		
		frm.setSize(200,150);
		frm.setBackground(Color.yellow);
		frm.setVisible(true);
		
		System.out.println(frm.getColorModel());
		System.out.println(frm.size());
		System.out.println(frm.WIDTH);
		System.out.println(frm.HEIGHT);
		
		System.out.println(frm.getWidth());
		System.out.println(frm.getHeight());
	}
}
