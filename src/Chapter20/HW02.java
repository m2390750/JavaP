package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW02 extends Frame implements ActionListener{
	static HW02 frm=new HW02();
	static Button btn1=new Button("Red");
	static Button btn2=new Button("Green");
	Button btn;
	boolean click=false;
	public static void main(String args[])
	{	BorderLayout br=new BorderLayout();
		frm.setLayout(br);
		frm.setTitle("Drawing example");frm.setSize(200,200);
		frm.add(btn1,br.NORTH);
		frm.add(btn2,br.SOUTH);
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	click=true;
		btn=(Button)e.getSource();
		Graphics g=getGraphics();
		paint(g);
	}
	public void paint(Graphics g)
	{
		if(click&&btn==btn1)
		{	
			g.setColor(Color.red);
			g.setFont(new Font("Courier New",Font.PLAIN,18));
			g.drawString("Time files", 100, 100);
		}
		else if(click&&btn==btn2)
		{
			g.setColor(Color.green);
			g.setFont(new Font("Courier New",Font.PLAIN,18));
			g.drawString("Time files",100,100);
		}
	}
}
