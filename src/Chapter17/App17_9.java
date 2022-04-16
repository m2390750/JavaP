package Chapter17;
import java.awt.*;
public class App17_9 {
	
	static Frame frm=new Frame("Button class");
	static Button btn=new Button("Push Me!!");
	
	public static void main(String args[])
	{
		frm.setLayout(null);
		btn.setBounds(45, 65, 100, 40);
		frm.setSize(24000,15000);
		frm.add(btn);
		frm.setVisible(true);
	}

}
