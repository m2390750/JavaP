package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class App19_8 extends Frame implements ActionListener,ItemListener{
	static App19_8 frm=new App19_8();
	static Dialog dlg=new Dialog(frm);//建立Dialog物件dig
	static Button Change_btn=new Button("Change Color");//按鈕
	static Button OK_btn=new Button("OK");
	static Button Cancel_btn=new Button("Cancel");
	static Checkbox ckb1=new Checkbox("White");//核取方塊
	static Checkbox ckb2=new Checkbox("Yellow");
	static Color clr;
	
	public static void main(String args[])
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,5,30));
		CheckboxGroup grp=new CheckboxGroup();
		
		ckb1.setCheckboxGroup(grp);ckb2.setCheckboxGroup(grp);
		frm.setSize(200,150);
		frm.setTitle("Frame");
		frm.setBackground(Color.pink);
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e){System.exit(0);}});
//		dlg.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e){System.exit(0);}});
		dlg.setTitle("Dialog");
		dlg.setSize(150,120);
		dlg.setLayout(null);
		
		ckb1.setBounds(20,50,60,20);
		ckb2.setBounds(20,70,60,20);
		OK_btn.setBounds(85,45,50,20);
		Cancel_btn.setBounds(85,70,50,20);
		
		dlg.add(OK_btn);
		dlg.add(Cancel_btn);
		dlg.add(ckb1);
		dlg.add(ckb2);
		
		Change_btn.addActionListener(frm);
		Cancel_btn.addActionListener(frm);
		OK_btn.addActionListener(frm);
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		
		frm.add(Change_btn);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button btn=(Button)e.getSource();
		if(btn==Change_btn)
		{
			dlg.setLocation(120,80);
			dlg.setVisible(true);
		}
		else if(btn==OK_btn)
		{
			frm.setBackground(clr);
			dlg.setVisible(false);
		}
		else if(btn==Cancel_btn)
			dlg.setVisible(false);	
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(ckb1.getState())
			clr=Color.white;
		else if(ckb2.getState())
			clr=Color.yellow;
	}
}


