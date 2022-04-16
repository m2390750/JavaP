package Chapter17;
import java.awt.*;

public class App17_4 extends Frame{

		Label lab=new Label("Hello Java!!");
		
		public App17_4(String str)
		{
			super(str);
			add(lab);
		}
public static void main(String args[])
		{
			App17_4 frm=new App17_4("my first AWT program");
			
			frm.setSize(220,150);
			frm.setBackground(Color.blue);
			frm.setLocation(250,250);
			frm.setVisible(true);
		}
}
