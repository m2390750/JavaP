package Chapter18;
import java.awt.*;
import java.awt.event.*;
public class HW16 extends Frame implements KeyListener,ActionListener,ItemListener {
		
		static HW16 frm=new HW16();
		static Label lab=new Label();//下面顯示的話
		static Label lab1=new Label();//算式題目
		static Label lab2=new Label();//驗證
		static TextField txf=new TextField();//輸入答案的地方
		static Button btn=new Button("Next");//Next按鍵
		static Checkbox ckb1=new Checkbox("+");
		static Checkbox ckb2=new Checkbox("-");
		static int a,b,sum;
		static String str="0";
		public static void main(String args[])
		{		
			CheckboxGroup grp=new CheckboxGroup();
			ckb1.setCheckboxGroup(grp);
			ckb2.setCheckboxGroup(grp);
			
			frm.setSize(400,400);
			frm.setTitle("Key Event");
			frm.setLayout(null);
			txf.setBounds(90,60,30,20);
			
			txf.addKeyListener(frm);
			ckb1.addItemListener(frm);
			ckb2.addItemListener(frm);
			
			lab.setBounds(150,60,120,20);
			lab.setAlignment(Label.RIGHT);
			lab1.setBounds(50,100,100,20);
			lab1.setAlignment(Label.CENTER);
			lab2.setBounds(100,150,100,20);
			
			ckb1.setBounds(120,40,30,20);
			ckb2.setBounds(160,40,30,20);
			
			btn.setBounds(200,200,50,50);
			btn.addActionListener(frm);	
			frm.add(btn);		
			frm.add(lab);
			frm.add(lab1);
			frm.add(lab2);
			frm.add(txf);
			frm.add(ckb1);
			frm.add(ckb2);
			frm.setVisible(true);
		}
		public void setNum()
		{
		a=(int)(100*Math.random());
		b=(int)(100*Math.random());
		}
		
		public void itemStateChanged(ItemEvent e) {
			setNum();
		lab.setBackground(Color.white);
		lab.setText("");	
		txf.setText("");
		
		if(ckb1.getState()==true)
			{lab1.setText(a+"+"+b+"=");lab2.setText("正數");}
		else if(ckb2.getState()==true)
			{lab1.setText(a+"-"+b+"=");lab2.setText("負數");}
		}
		
		public void actionPerformed(ActionEvent e) {
			setNum();
		lab.setBackground(Color.white);
		lab.setText("");
		txf.setText("");
		
		if(ckb1.getState()==true)
			{lab1.setText(a+"+"+b+"=");lab2.setText("正數");}
		else if(ckb2.getState()==true)
			{lab1.setText(a+"-"+b+"=");lab2.setText("負數");}
		}
		
				public void keyReleased(KeyEvent e) {
		int key,ans;
		
		str=txf.getText();
		key=e.getKeyCode();
		if(key==10)
		{	
			sum=Integer.parseInt(str);
			if(ckb1.getState()==true)
			ans=a+b;
			else
			ans=a-b;
			if(ans==sum)
			{
			lab.setText("You are right!");
			lab.setBackground(Color.yellow);
			}
			else
			{
			lab.setText("Try it again!");
			lab.setBackground(Color.pink);
			}
		}
	}
		public void keyPressed(KeyEvent e) {}
		
		public void keyTyped(KeyEvent e) {}
}
