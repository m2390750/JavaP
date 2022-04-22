package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class HW01 extends Frame implements ItemListener{
	static HW01 frm=new HW01();
	static Label lab=new Label();
	static List lst=new List();
	
	public static void main(String args[])
	{
		
		frm.setTitle("Frame");
		

		
		frm.setLayout(null);
		
		lst.add("Dialog");
		lst.add("Monspaced");
		lst.add("SansSerif");
		lst.add("Serif");
		lab.setBackground(Color.yellow);
		
		lst.setBounds(20, 40, 100, 100);
		lab.setBounds(25, 150,150, 20);
		frm.setSize(200,150);
		frm.add(lst);
		frm.add(lab);
		frm.setBackground(Color.orange);
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		lst.addItemListener(frm);
		
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String txt=lst.getSelectedItem();
		if(txt=="Dialog")
			lab.setText(txt);
		else if(txt=="Monspaced")
			lab.setText(txt);
		else if(txt=="SansSerif")
			lab.setText(txt);	
		else if(txt=="Serif")
			lab.setText(txt);
	}		
}
