package Chapter18;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.*;
public class HW09 extends Frame implements ActionListener
 {
static HW09 frm=new HW09();
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



frm.setSize(200,150);
frm.add(btn1);
frm.add(btn2);
frm.add(btn3);
frm.setVisible(true);
}
	

	public void actionPerformed(ActionEvent e)
	{
	Button btn= (Button) e.getSource();
	int btnkey=e.getModifiers();
	int key=InputEvent.ALT_DOWN_MASK+InputEvent.CTRL_DOWN_MASK;
	
	System.out.println(btnkey);
	if(btn==btn1 && btnkey==650)
	{frm.setBackground(Color.yellow);}
	else if(btn==btn2 && btnkey==650)
	{frm.setBackground(Color.green);}
	else if (btn==btn3)
	System.exit(0);
	}
	} 