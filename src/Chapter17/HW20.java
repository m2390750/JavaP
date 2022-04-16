package Chapter17;
import static java.awt.FlowLayout.RIGHT;

import java.awt.*;
public class HW20 {
	public static void main(String args[])
	{	
		Frame frm=new Frame("aaa");
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER,100,200);
		
		Label lab=new Label();
		frm.setLayout(flow);
		frm.setSize(2000,1500);
		
		lab.setBackground(Color.orange);
		lab.setText("Honesty is the best policy");
		
		frm.add(new Button("OK"));
		frm.add(new Button("Exit"));
		
		frm.add(lab);
		frm.setVisible(true);
	}
}
