package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class HW05 extends Frame implements ItemListener{
	static HW05 frm=new HW05();
	static Choice chc=new Choice();
	static Label lab=new Label();
	public static void main(String args[])
	{
		
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		frm.setSize(200,200);
		frm.setLayout(null);
		frm.setBackground(Color.gray);
		chc.setBounds(50, 50, 80, 20);
		lab.setBounds(130,50, 80, 80);
		chc.add("White");
		chc.add("Black");
		chc.add("Blue");
		chc.add("Yellow");
		chc.add("Green");
		chc.addItemListener(frm);
		frm.add(chc);
		frm.add(lab);
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String s=chc.getSelectedItem();
		
		if(s=="White")
			{lab.setBackground(Color.white);}
		else if(s=="Black")
			{lab.setBackground(Color.BLACK);}
		else if(s=="Blue")
			{lab.setBackground(Color.blue);}
		else if(s=="Yellow")
			{lab.setBackground(Color.yellow);}
		else if(s=="Green")
			{lab.setBackground(Color.green);}
		
		
	}
	
	
}
