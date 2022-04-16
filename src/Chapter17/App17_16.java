package Chapter17;
import java.awt.*;
public class App17_16 {
	public static void main(String args[])
	{
		Frame frm=new Frame("Flow Layout");
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER,100,10);
		
		frm.setLayout(flow);
		frm.setSize(200,150);
		frm.setBackground(Color.yellow);
		frm.add(new TextField("This,8"));
		frm.add(new TextField("i321432132s,50"));
		frm.add(new TextField("Flow Layout,16"));
		frm.setVisible(true);
	}
}
