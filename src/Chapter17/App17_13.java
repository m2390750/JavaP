package Chapter17;
import java.awt.*;
public class App17_13 {

	static Frame frm=new Frame("TextArea class");
	static TextArea txa;
	
	public static void main(String args[])
	{
		txa=new TextArea("demo",100,100,TextArea.SCROLLBARS_BOTH);
		frm.setLayout(null);
		txa.setBounds(30, 45, 140, 80);
		frm.setSize(200,150);
		frm.add(txa);
		frm.setVisible(true);
	}
}
