package Chapter17;
import java.awt.*;

public class HW13 {
	static Frame frm=new Frame("Checkbox class");
	static Checkbox ckb1=new Checkbox("ViewSonic");
	static Checkbox ckb2=new Checkbox("Sony");
	static Checkbox ckb3=new Checkbox("Benq");
	
	public static void main(String args[])
	{
		CheckboxGroup grp=new CheckboxGroup();
		
		frm.setSize(200,150);
		frm.setLayout(null);
		frm.setBackground(Color.yellow);
		
		ckb1.setBounds(20,40,140,20);
		ckb2.setBounds(20,60,140,20);
		ckb3.setBounds(20,80,140,20);
		
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		ckb3.setCheckboxGroup(grp);
		
		ckb3.setState(true);
//		ckb2.setState(true);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		frm.setVisible(true);
	}
}
