package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW16_01 extends Frame implements ActionListener{
	
	static HW16_01 frm=new HW16_01();
	static Button btn1=new Button("Circle");
	static Button btn2=new Button("Clear");
	int r,g,b;
	Color co;
	
	public static void main(String args[])
	{
		
		frm.setSize(400,400);
		frm.setLayout(new FlowLayout());
		frm.add(btn1);
		frm.add(btn2);
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		frm.setVisible(true);
;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		Button btn=(Button)e.getSource();
				
		if(btn==btn1)
		{
			r=(int)(Math.random()*255);
			g=(int)(Math.random()*255);
			b=(int)(Math.random()*255);
			Graphics gr=getGraphics();
			paint(gr);
		}
		else
		{	
			Graphics gr=getGraphics();
			paint(gr);	
			gr.setColor(Color.white);
			gr.fillRect(0, 0, getWidth(), getHeight());
		}
	}
	public void paint(Graphics gr)
		{
		co=new Color(r,g,b);
		gr.setColor(co);
		gr.fillOval(60, 60, 80, 80);
		}
}
