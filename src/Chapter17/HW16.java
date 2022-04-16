package Chapter17;
import java.awt.*;
public class HW16 {
	
	static Frame frm=new Frame("TextField class");
	static TextField txf1=new TextField("Speech is silver");
	static TextField txf2=new TextField("silence is gold");
	
	public static void main(String args[])
	{
		frm.setLayout(null);
		frm.setBounds(500,500,800, 600);
		frm.setBackground(Color.yellow);
		
		
		txf1.setBounds(20, 50, 140, 20);
		txf2.setBounds(20, 90, 140, 20);
		
		txf1.setForeground(Color.blue);
		txf2.setForeground(Color.red);
		
		frm.add(txf1);
		frm.add(txf2);
		
		System.out.println(txf1.getText());
		System.out.println(txf2.getText());
		frm.setVisible(true);
		
	}
}
