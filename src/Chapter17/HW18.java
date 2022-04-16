package Chapter17;
import java.awt.*;

class setText extends TextArea
{
	public void setText(String a,int b,int c)
	{
		
	}
}
public class HW18 {

	static Frame frm=new Frame("TextArea class");
	static TextArea txa;
	
	
	
	public static void main(String args[])
	{
		txa=new TextArea("demo",100,100,TextArea.SCROLLBARS_BOTH);
		frm.setLayout(null);
		txa.setBounds(30, 45, 140, 80);
		frm.setSize(200,150);
		frm.add(txa);
		txa.setText("Welcome to the world of Java");
		frm.setVisible(true);
	}
}
