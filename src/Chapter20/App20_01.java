package Chapter20;
import java.awt.*;
import java.awt.event.*;

public class App20_01 extends Frame implements ActionListener{
	static App20_01 frm=new App20_01();
	static Button btn=new Button("Draw");
	
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
		btn.addActionListener(frm);
		frm.setVisible(true);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		Graphics g=getGraphics();
		g.drawRect(100, 50, 70, 55);
	}

}
