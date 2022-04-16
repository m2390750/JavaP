package Chapter17;
import java.awt.*;

public class HW05 {
	static Frame frm=new Frame();
	
	public static void main(String args[])
	{	
		frm.setTitle("Frame class");
		frm.setSize(200,150);
		frm.setLocation(100,50);
		frm.setVisible(true);
		frm.setState(Frame.ICONIFIED);//視窗顯示最小化
		
		System.out.println("state="+frm.getState());
		System.out.println("title="+frm.getTitle());
		System.out.println("visible="+frm.isVisible());
		System.out.println(frm.getX());
		System.out.println(frm.getY());
	}
}
