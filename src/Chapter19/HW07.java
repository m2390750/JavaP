package Chapter19;
import java.awt.*;
import java.awt.event.*;


public class HW07 extends Frame implements ActionListener,ItemListener,KeyListener,TextListener{
	
	static HW07 frm=new HW07();
	static Label lab=new Label("�魫(kg)");
	static Label lab1=new Label("��������q");
	static Label lab2=new Label("���ʶq");
	static TextField ta1=new TextField();
	static TextField ta2=new TextField();
	static Choice lst=new Choice();
	static Button btn=new Button("�p��");
	static Label lab3=new Label();//�d����
	static Label lab4=new Label();//���y
	static double weight,in,calorie;
	static String str1,str2;
	public static void main(String args[])
	{	
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		
		frm.setSize(400,400);
		frm.setLayout(null);
		lst.add("�j");
		lst.add("���q");
		lst.add("�C");
		lab.setBounds(20, 40, 50, 20);
		lab1.setBounds(20, 60, 70, 20);
		ta1.setBounds(100, 40, 40, 20);
		ta2.setBounds(100, 60, 40, 20);
		lab2.setBounds(250, 45, 50,20);
		lst.setBounds(250,80,50,30);
		btn.setBounds(35,90, 50,20);
		lab3.setBackground(Color.pink);
		lab4.setBackground(Color.orange);
		lab3.setBounds(100,80,120,20);
		lab4.setBounds(100,100,120,20);
		lst.addItemListener(frm);
		ta1.addKeyListener(frm);
		ta2.addKeyListener(frm);
		btn.addActionListener(frm);
		
		frm.add(lab);
		frm.add(lab1);
		frm.add(ta1);
		frm.add(ta2);
		frm.add(lab2);
		frm.add(btn);
		frm.add(lab3);
		frm.add(lab4);
		frm.add(lst);
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		{
			weight=Double.parseDouble(str1);
			in=Double.parseDouble(str2);
			String act=lst.getSelectedItem();
			
			if(act=="�j")
			calorie=weight*22/0.6;
			else if(act=="���q")
			calorie=weight*22/0.65;
			else if(act=="�C")
			calorie=weight*22/0.75;
			calorie=Math.round(calorie);
			lab3.setText("�C��һݼ��q��"+(int)calorie+"�d");
			
			if(in>calorie)
				lab4.setText(" �A�Y�Ӧh�F!");
			else
				lab4.setText(" �ЫO���U�h!");
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		TextField tx=(TextField)e.getSource();
		if(tx==ta1)
			str1=tx.getText();
		else if(tx==ta2)
			str2=tx.getText();
		
	}
	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		
	}
}
