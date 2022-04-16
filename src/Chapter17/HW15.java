package Chapter17;
import java.awt.*;
public class HW15 {
	static Frame frm=new Frame("Checkbox class");
	static Checkbox ckb1= new Checkbox("Epson 5900L");
	static Checkbox ckb2= new Checkbox("HP LaserJet 4p",true);
	static Checkbox ckb3= new Checkbox("Other printer",true);
	
	public static void main(String args[])
	{
		CheckboxGroup grp=new CheckboxGroup();
		frm.setSize(200,150);
		frm.setLayout(null);
		frm.setBackground(Color.yellow);
		ckb1.setBounds(20,40,140,20);
		ckb2.setBounds(20,60,80,20);
		ckb3.setBounds(20,80,140,20);
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		ckb3.setCheckboxGroup(grp);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		frm.setVisible(true);
	}
}
