package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW01 extends Frame implements ActionListener{
	static HW01 frm=new HW01();
	static Button btn1=new Button("Red");
	static Button btn2=new Button("Green");
	boolean clicked=false;
	Button btn;
	public static void main(String args[])
	{	frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		
		BorderLayout br=new BorderLayout();
		frm.setTitle("Drawing example");
		frm.setSize(200,150);
		frm.setLayout(br);
		frm.add(btn1,br.NORTH);
		frm.add(btn2,br.SOUTH);
		
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	clicked=true;
		btn=(Button)e.getSource();
		Graphics g=getGraphics();
		paint(g);
	}
	public void paint(Graphics g)
	{
		if(clicked&&btn==btn1)
		{
			g.setColor(Color.red);
			g.drawRect(70, 55, 70, 55);
		}
	else if(clicked&&btn==btn2)
		{
			g.setColor(Color.green);
			g.drawRect(70, 55, 70, 55);
		}
		
	}
}
