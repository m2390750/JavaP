package Chapter17;
import java.awt.*;

public class HW14 {
	static Frame frm=new Frame();
	static Checkbox ckb1=new Checkbox("ViewSonic");
	static Checkbox ckb2=new Checkbox("Sony");
	static Checkbox ckb3=new Checkbox("Benq");
	
	public static void main(String args[])
	{
		frm.setLayout(null);
		frm.setSize(200,200);
		frm.setBackground(Color.yellow);
		
		ckb1.setBounds(60, 60, 100, 20);
		ckb2.setBounds(60,100, 100, 20);
		ckb3.setBounds(60,140, 100, 20);
		
		CheckboxGroup ckbg=new CheckboxGroup();
		ckb1.setCheckboxGroup(ckbg);
		ckb2.setCheckboxGroup(ckbg);
		ckb3.setCheckboxGroup(ckbg);
		
		ckb3.setState(true);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		
		frm.setVisible(true);
		System.out.println(ckb1.getState());
		System.out.println(ckb1.getLabel());
	}
}
