package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class App20_03 extends Frame implements ActionListener{
	static App20_03 frm=new App20_03();
	static Button btn=new Button("Draw");
	static boolean clicked = false;//宣告boolean變數,用來判別按鈕是否按下
	
	public static void main(String args[])
	{
		
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		BorderLayout br=new BorderLayout();
		frm.setTitle("Drawing example");
		frm.setLayout(br);
		frm.setSize(200,150);
		frm.add(btn,br.SOUTH);
		
		btn.addActionListener(frm);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		clicked=true;
		Graphics g=getGraphics();
		paint(g);
	}
	public void paint(Graphics g)
	{
		if(clicked)
			g.drawRect(100, 50, 70, 55);
	}

}
