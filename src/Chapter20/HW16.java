package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW16 extends Frame implements ActionListener{
	
	static HW16 frm=new HW16();
	static Button btn1=new Button("Circle");
	static Button btn2=new Button("Clear");
	int a;
	boolean clicked=false;
	public static void main(String args[])
	{
		
		frm.setSize(400,400);
		frm.setLayout(new FlowLayout());
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		frm.add(btn1);
		frm.add(btn2);
		frm.setVisible(true);
;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		clicked=true;
		Button btn=(Button)e.getSource();
		Graphics g=getGraphics();
		a=((int)(Math.random()*50));
		
		if(clicked&&btn==btn1)
		{
			paint(g);
		}
		else if(btn==btn2)
		{	
			g.setColor(Color.black);
			g.clearRect(80, 80, a, a);		
		}
	}
	public void paint(Graphics g)
		{
		g.fillOval(80, 80, a, a);
		}
}
