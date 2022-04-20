package Chapter19;
import java.awt.*;
public class App19_3 extends Frame {
	
	static App19_3 frm=new App19_3();
	static Choice chc=new Choice();
	public static void main(String args[])
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		frm.setTitle("Choice class");
		for(int i=0;i<=4;i++)
			chc.add("Choice Item"+i);
		
		frm.add(chc);
		frm.setSize(150,200);
		frm.setBackground(Color.yellow);
		frm.setVisible(true);
	}
}
