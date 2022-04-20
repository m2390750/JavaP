package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW10 extends Frame implements ItemListener{
	static HW10 frm=new HW10();
	static Checkbox ckb1=new Checkbox("Green");
	static Checkbox ckb2=new Checkbox("Blue");
	static Checkbox ckb3=new Checkbox("Yellow");
	
	public static void main(String args[])
	{	
//		frm.setLayout(new FlowLayout(FlowLayout.RIGHT));
		frm.setSize(200,200);
		frm.setTitle("Item Event");
		frm.setLayout(null);
		CheckboxGroup grp=new CheckboxGroup();
		
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		ckb3.setCheckboxGroup(grp);
		ckb1.setBounds(30,40,140,20);
		ckb2.setBounds(30,70,140,20);
		ckb3.setBounds(30,100,140,20);
		
		frm.add(ckb1);
		frm.add(ckb2);
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		ckb3.addItemListener(frm);
		frm.add(ckb3);
		ckb1.setState(true);
		
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		 if(ckb1.getState()==true)
			 frm.setBackground(Color.green);
		 else if(ckb2.getState()==true)
			 frm.setBackground(Color.blue);
		 else if(ckb3.getState()==true)
			 frm.setBackground(Color.yellow);
	}
}
