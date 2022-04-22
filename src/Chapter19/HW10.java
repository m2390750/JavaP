package Chapter19;
import java.awt.*;
import java.awt.event.*;

public class HW10 extends Frame implements AdjustmentListener{
	static HW10 frm=new HW10();
	static Scrollbar scr1=new Scrollbar();
	static Scrollbar scr2=new Scrollbar();
	static Scrollbar scr3=new Scrollbar();
	static Label lab1=new Label();
	static Label lab2=new Label();
	static Label lab3=new Label();
	static Label lab4=new Label();
	public static void main(String args[])
	{	frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e){System.exit(0);}});
		frm.setSize(400,400);
		frm.setLayout(null);
		frm.setBackground(Color.gray);
		scr1.setBounds(50, 50, 100,20);
		scr2.setBounds(200,50, 100,20);
		scr3.setBounds(350,50, 100,20);
		lab1.setBounds(50, 100,100,20);
		lab2.setBounds(200,100,100,20);
		lab3.setBounds(350,100,100,20);
		lab4.setBounds(50, 150,400,60);
		lab1.setBackground(Color.white);lab2.setBackground(Color.white);lab3.setBackground(Color.white);lab4.setBackground(Color.white);
		
		scr1.setOrientation(Scrollbar.HORIZONTAL);
		scr2.setOrientation(Scrollbar.HORIZONTAL);
		scr3.setOrientation(Scrollbar.HORIZONTAL);
		
		lab1.setFont(new Font("Dialog",Font.BOLD,12));
		lab2.setFont(new Font("Dialog",Font.BOLD,12));
		lab3.setFont(new Font("Dialog",Font.BOLD,12));
		
		lab1.setBackground(Color.red);
		lab2.setBackground(Color.green);
		lab3.setBackground(Color.blue);
		scr1.addAdjustmentListener(frm);
		scr2.addAdjustmentListener(frm);
		scr3.addAdjustmentListener(frm);
		scr1.setValues(200,2,0,257);
		scr2.setValues(200,2,0,257);
		scr3.setValues(200,2,0,257);
		frm.add(scr1);
		frm.add(scr2);
		frm.add(scr3);
		frm.add(lab1);
		frm.add(lab2);
		frm.add(lab3);
		frm.add(lab4);
		frm.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int c1=scr1.getValue();
		int c2=scr2.getValue();
		int c3=scr3.getValue();
		lab1.setText("Red:"+c1);
		lab2.setText("Green:"+c2);
		lab3.setText("Blue:"+c3);
		lab4.setBackground(new Color(c1,c2,c3));
	}
}
