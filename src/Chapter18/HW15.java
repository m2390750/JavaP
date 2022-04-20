package Chapter18;
import java.awt.*;
import java.awt.event.*;
public class HW15 extends Frame implements KeyListener,ActionListener {
		
		static HW15 frm=new HW15();
		static Label lab=new Label();//下面顯示的話
		static Label lab1=new Label();//算式題目
		static TextField txf=new TextField();//輸入答案的地方
		static Button btn=new Button("Next");//Next按鍵
		static int a,b;
		public static void main(String args[])
		{
			
			frm.setSize(200,150);
			frm.setTitle("Key Event");
			frm.setLayout(null);
			txf.setBounds(90,60,30,20);
			txf.addKeyListener(frm);
			lab.setBounds(150,60,120,20);
			lab.setAlignment(Label.RIGHT);
			lab1.setBounds(50,100,100,20);
			lab1.setAlignment(Label.CENTER);
			btn.setBounds(130,60,30,20);
			btn.addActionListener(frm);		
			setNum();
			frm.add(txf);
			frm.add(lab1);
			frm.add(btn);
			frm.add(lab);
			frm.setVisible(true);
		}
		public static void setNum()
		{
		a=(int)(100*Math.random());
		b=(int)(100*Math.random());
		lab1.setText(a+"+"+b+"=");
		}
		public void actionPerformed(ActionEvent e) {
		txf.setBackground(Color.white);
		txf.setText("");
		lab.setText("");
		setNum();			
		}
		
	
		public void keyReleased(KeyEvent e) {
		String str="0";
		int sum,key;
		
		str=txf.getText();
		key=e.getKeyCode();
		if(key==10)
		{	
			sum=Integer.parseInt(str);
			if(a+b==sum)
			{
			lab.setText("You are right");
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
