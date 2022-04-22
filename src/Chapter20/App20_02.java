package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_02 extends Frame implements ActionListener{
	static App20_02 frm=new App20_02();
	static Button btn=new Button("Draw");
	
	public static void main(String args[])
	{
		frm.addWindowListener(new WindowAdapter() {public void
			 windowClosing(WindowEvent e) {System.exit(0);}});
		BorderLayout br=new BorderLayout();
		frm.setTitle("Drawing exaample");
		frm.setLayout(br);
		frm.setSize(200,150);
		frm.add(btn,br.SOUTH);
		
		btn.addActionListener(frm);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Graphics g=getGraphics();
		paint(g);
	}
	public void paint(Graphics g)
	{
		g.drawRect(100, 50, 70, 55);
	}
}