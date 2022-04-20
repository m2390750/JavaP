package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_5 extends Frame implements ItemListener{
	static App18_5 frm =new App18_5();
	static Checkbox ckb1=new Checkbox("Epson 5900L");
	static Checkbox ckb2=new Checkbox("HP LaserJet 4p");
	static Label lab=new Label("Select a printer");
	
	public static void main(String args[])
	{
		CheckboxGroup grp=new CheckboxGroup();
		frm.setSize(200, 150);
		frm.setTitle("Item Event");
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		
		lab.setBackground(Color.orange);
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		
		frm.add(lab);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(ckb1.getState()==true)
			lab.setText(" Epson 5900L");
		else if (ckb2.getState()==true)
			lab.setText(" HP LaserJet 4p");
	}



	
}
