package Chapter17;
import java.awt.*;
public class App17_8 {
	static Frame frm=new Frame("Button class");
	static Button btn=new Button("Push Me!!");
	
	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);
	}
}
