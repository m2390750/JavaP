package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW11 extends Frame implements ItemListener {
	
	static HW11 frm=new HW11();
	static Checkbox ckb1=new Checkbox("Left");
	static Checkbox ckb2=new Checkbox("Center");
	static Checkbox ckb3=new Checkbox("Right");
	static FlowLayout flow=new FlowLayout();
	
	public static void main(String args[])
	{	
		CheckboxGroup grp=new CheckboxGroup();
		
		frm.setSize(500,500);
		frm.setLayout(flow);
		
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		ckb3.setCheckboxGroup(grp);
		
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		ckb3.addItemListener(frm);
		
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		ckb1.setState(true);
		frm.setVisible(true);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(ckb1.getState()==true)
		{flow.setAlignment(FlowLayout.LEFT);}
		else if(ckb2.getState()==true)
		{flow.setAlignment(FlowLayout.CENTER);}
		else if(ckb3.getState()==true)
		{flow.setAlignment(FlowLayout.RIGHT);}
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		frm.setVisible(true);
	}
}
