package Chapter18;

import java.awt.*;
import java.awt.event.*;
public class HW16_1 extends Frame implements KeyListener,ActionListener,ItemListener

{
static HW16_1 frm=new HW16_1();
static Label lab1=new Label();
static Label lab2=new Label();
static Label lab3=new Label("Select operator");
static Button btn=new Button("Next");
static TextField txf=new TextField(3);
static Checkbox ckb1=new Checkbox("+");
static Checkbox ckb2=new Checkbox("-");
static int a,b,sum;
static String str="0";

public static void main(String args[])
{
CheckboxGroup grp=new CheckboxGroup();
ckb1.setCheckboxGroup(grp);
ckb2.setCheckboxGroup(grp);

frm.setSize(200,150);
frm.setTitle("Key Event");
frm.setLayout(null);
txf.setBounds(90,75,30,20);
txf.addKeyListener(frm);
ckb1.addItemListener(frm);
ckb2.addItemListener(frm);
lab1.setBounds(30,75,60,20);
lab1.setAlignment(Label.RIGHT);
lab2.setBounds(50,110,100,20);
lab2.setAlignment(Label.CENTER);
lab3.setBounds(15,40,90,20);
lab3.setBackground(Color.orange);
ckb1.setBounds(120,40,30,20);
ckb2.setBounds(160,40,30,20);
btn.setBounds(130,75,30,20);
btn.addActionListener(frm);
frm.add(btn);
frm.add(lab1);
frm.add(lab2);
frm.add(lab3);
frm.add(txf);
frm.add(ckb1);
frm.add(ckb2);
frm.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
setNum();
lab2.setBackground(Color.white);
lab2.setText("");
txf.setText("");
if(ckb1.getState()==true)
lab1.setText(a+"+"+b+"=");
else if(ckb2.getState()==true)
lab1.setText(a+"-"+b+"=");
}
public void setNum()
{
a=(int)(100*Math.random());
b=(int)(100*Math.random());

}
public void actionPerformed(ActionEvent e)
{
setNum();
lab2.setBackground(Color.white);
lab2.setText("");
txf.setText("");
if(ckb1.getState()==true)
lab1.setText(a+"+"+b+"=");
else if(ckb2.getState()==true)
lab1.setText(a+"-"+b+"=");
}
public void keyReleased(KeyEvent e)
{
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
lab2.setText("You are right!");
lab2.setBackground(Color.yellow);
}
else
{
lab2.setText("Try it again!");
lab2.setBackground(Color.pink);
}
}
}
public void keyPressed(KeyEvent e){ }
public void keyTyped(KeyEvent e){ }
}