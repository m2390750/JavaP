package Chapter20;
import java.awt.*;
import java.awt.event.*;

public class HW03 extends Frame implements ActionListener{
	static HW03 frm=new HW03();
	static Button btn=new Button("Draw");
	static Button btn1=new Button("Clear");
	public static void main(String args[])
	{
		frm.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) 
		{System.exit(0);}});
		BorderLayout br=new BorderLayout();
		frm.setTitle("Drawing example");
		frm.setLayout(br);
		frm.setSize(200,150);
		frm.add(btn,br.SOUTH);
		frm.add(btn1,br.EAST);
		btn.addActionListener(frm);
		btn1.addActionListener(frm);
		frm.setVisible(true);
	}
	
	public void actionPerformed (ActionEvent e)
	{	
		Button bts=(Button)e.getSource();
		Graphics g=getGraphics();
		if(bts==btn)
			{g.drawRect(100, 50, 70, 55);}
		else if(bts==btn1)
		{
			g.setColor(frm.getBackground());
			g.drawRect(100, 50, 70, 55);
		}
	}

}
