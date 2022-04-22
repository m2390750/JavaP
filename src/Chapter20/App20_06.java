package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_06 extends Frame implements ActionListener{
	static App20_06 frm=new App20_06();
	static Button btn1=new Button("Brighter");
	static Button btn2=new Button("Darker");
	Color co=new Color(255,0,255);
	
	public static void main(String args[])
	{
frm.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0);}});
		frm.setTitle("Brighter&Darker");frm.setLayout(new FlowLayout());
		frm.setSize(200,150);frm.add(btn1);frm.add(btn2);
		btn1.addActionListener(frm);btn2.addActionListener(frm);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	Button btn=(Button)e.getSource();
	if(btn==btn1)
		co=co.brighter();
	else if(btn==btn2)
		co=co.darker();
	
	Graphics g=getGraphics();
	paint(g);
	}
	public void paint(Graphics g)
	{
		g.setColor(co);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
}
