package Chapter19;
import java.awt.*;
import java.awt.event.*;

public class HW12_13_14 extends Frame implements KeyListener,ActionListener{
	
	static HW12_13_14 frm=new HW12_13_14();
	static Dialog dlg=new Dialog(frm);
	static TextField txf1=new TextField();
	static TextField txf2=new TextField();
	
	static Label lab1=new Label("身高");
	static Label lab2=new Label("體重");
	static Label lab3=new Label("公分");
	static Label lab4=new Label("公斤");
	static Label lab5=new Label();
	static Label lab6=new Label();
	static Button btn1=new Button("計算");
	static Button btn2=new Button("結束");
	static Button btn3=new Button("確定");
	static String str1,str2;
	static double kg,height;
	public static void main(String args[])
	{	
		frm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){frm.dispose();dlg.dispose();}});
		dlg.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){dlg.dispose();}});
		frm.setLayout(null);
		frm.setTitle("BMI");
		frm.setSize(200,150);
		frm.setBackground(Color.yellow);
		
		dlg.setTitle("顯示BMI");
		dlg.setSize(180,120);
		dlg.setLayout(null);
		
		dlg.add(lab5);dlg.add(lab6);dlg.add(btn3);dlg.setBackground(Color.orange);
		lab5.setAlignment(Label.CENTER);lab6.setAlignment(Label.CENTER);
		lab5.setBounds(10,35,160,20);lab6.setBounds(10,58,160,20);
		btn3.setBounds(70,85,50,20);
		
		btn1.addActionListener(frm);btn2.addActionListener(frm);btn3.addActionListener(frm);
		txf1.addKeyListener(frm);txf2.addKeyListener(frm);
		lab1.setAlignment(Label.CENTER);lab2.setAlignment(Label.CENTER);
		lab3.setAlignment(Label.CENTER);lab4.setAlignment(Label.CENTER);
		lab1.setBounds(10,40,50,20);txf1.setBounds(62,40,80,20);
		lab3.setBounds(135,40,50,20);lab2.setBounds(10,70,50,20);
		txf2.setBounds(62,70,80,20);lab4.setBounds(135,70,50,20);
		btn1.setBounds(40,110,50,20);btn2.setBounds(105,110,50,20);
		
		frm.add(btn1);frm.add(btn2);frm.add(lab1);frm.add(lab2);
		frm.add(lab3);frm.add(lab4);frm.add(txf1);frm.add(txf2);
		frm.setVisible(true);
	}
		public void actionPerformed(ActionEvent e)
		{
			height=Double.parseDouble(str1);
			height/=100;
			kg=Double.parseDouble(str2);
			double bmi=kg/(height*height);
			Button btn=(Button)e.getSource();
			
			if(btn==btn1)
			{
				dlg.setLocation(100,60);
				lab5.setText("BMI="+bmi);
				
				if(bmi<18.0)
					lab6.setText("太瘦了");
				else if(bmi>=18.0 && bmi<20.0)
					lab6.setText("有點瘦喔!");
				else if(bmi>=20.0 && bmi<22.0)
					lab6.setText("標準身材!");
				else if(bmi>=22.0 && bmi<24)
					lab6.setText("有點胖,要注意了!");
				else if(bmi>=24.0 && bmi<27.0)
					lab6.setText("太胖了!得減肥了!");
				else if(bmi>27.0)
					lab6.setText("肥胖程度影響健康啦!");
				dlg.setVisible(true);
			}
			else if(btn==btn2)
			{
				dlg.dispose();
				frm.dispose();
			}
			else if(btn==btn3)
			{
				dlg.setVisible(false);
			}
		}
		public void keyReleased(KeyEvent e)
		{
			TextField tx=(TextField)e.getSource();
			if(tx==txf1)
				str1=tx.getText();
			else if(tx==txf2)
				str2=tx.getText();
		}
		public void keyPressed(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	
	
}
