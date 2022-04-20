package Chapter18;
import java.awt.*;
public class App18_1 extends Frame
{
	static App18_1 frm= new App18_1();
	static Button btn=new Button();
	
	public static void main(String args[])
	{
		frm.setLayout(new FlowLayout());
		frm.setTitle("Action Event");
		frm.setSize(200, 150);
		frm.add(btn);
		frm.setVisible(true);
	}
}
