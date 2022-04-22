package Chapter19;

import java.awt.*;
import java.awt.event.*;
public class HW10_1 extends Frame implements AdjustmentListener
{
static HW10_1 frm=new HW10_1();
static Panel pnl=new Panel(new GridLayout(2,3,5,5));
static Scrollbar scr1=new Scrollbar();
static Scrollbar scr2=new Scrollbar();
static Scrollbar scr3=new Scrollbar();
static Label lab1=new Label("Red:");
static Label lab2=new Label("Green:");
static Label lab3=new Label("Blue:");
static Label lab4=new Label();

public static void main(String args[])
{
frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
frm.setLayout(null);
frm.setSize(220,160);
frm.setTitle("RGB Color");
pnl.setBounds(15,35,190,40);
pnl.add(scr1);
pnl.add(scr2);
pnl.add(scr3);
pnl.add(lab1);
pnl.add(lab2);
pnl.add(lab3);
scr1.setOrientation(Scrollbar.HORIZONTAL);
scr2.setOrientation(Scrollbar.HORIZONTAL);
scr3.setOrientation(Scrollbar.HORIZONTAL);
scr1.addAdjustmentListener(frm);
scr2.addAdjustmentListener(frm);
scr3.addAdjustmentListener(frm);
scr1.setValues(200,2,0,257);
scr2.setValues(200,2,0,257);
scr3.setValues(200,2,0,257);
lab1.setFont(new Font("Dialog",Font.BOLD,12));
lab2.setFont(new Font("Dialog",Font.BOLD,12));
lab3.setFont(new Font("Dialog",Font.BOLD,12));
lab1.setForeground(Color.white);
lab2.setForeground(Color.white);
lab3.setForeground(Color.white);
lab1.setBackground(Color.red);
lab2.setBackground(Color.green);
lab3.setBackground(Color.blue);
lab4.setBackground(new Color(200,200,200));
lab4.setBounds(15,85,190,60);
frm.add(pnl);
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