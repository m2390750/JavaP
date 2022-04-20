package Chapter18;
import java.awt.*;
import java.awt.event.*;
public class App18_4 extends Frame implements ActionListener
{
	static App18_4 frm=new App18_4();
	
	static Button btn1=new Button("Yellow");
	static Button btn2=new Button("Green");
	static Button btn3=new Button("Exit");
	
	public static void main(String args[])
	{
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		btn3.addActionListener(frm);
		
		frm.setTitle("Action Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setSize(200, 150);
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Button btn=(Button) e.getSource();
		
		if(btn==btn1)
		  frm.setBackground(Color.yellow);
		else if(btn==btn2)
		  frm.setBackground(Color.green);
		else
		  System.exit(0);	
	}
}
