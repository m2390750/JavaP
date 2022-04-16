package Chapter17;
import java.awt.*;

public class HW08 {
	public static void main(String args[])
	{
		Frame frm=new Frame("My Frame");
		Label lab=new Label("Knowledge is power.");
		
		frm.setSize(200,120);
		frm.setLayout(null);
//		lab.setSize(160, 20);
//		lab.setLocation(20, 60);
		lab.setBounds(20,60,160,20);
		lab.setBackground(Color.black);
		lab.setAlignment(lab.LEFT);
		lab.setForeground(Color.white);
		lab.setFont(new Font("Airal",Font.PLAIN,12));
		
		frm.add(lab);
		frm.setVisible(true);
	}
}
