
package Chapter17;
import java.awt.*;

public class HW09 {
	
	static Frame frm=new Frame("Label class");
	static Label lab=new Label();
	
	public static void main(String args[])
	{
		frm.setLayout(null);
		
		frm.setSize(200,150);
		frm.setBackground(Color.pink);
		lab.setText("Hello Java");
		lab.setBackground(Color.white);
		lab.setAlignment(Label.CENTER);
		lab.setForeground(Color.blue);
//		lab.setLocation(60,50);
//		lab.setSize(120,20);
		lab.setBounds(60, 50, 120, 20);
		lab.setFont(new Font("Serief",Font.ITALIC+Font.BOLD,18));
		frm.add(lab);
		frm.setVisible(true);
	}
}
