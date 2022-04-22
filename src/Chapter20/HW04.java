package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW04 extends Frame {
	static HW04 frm=new HW04();
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
		
		btn.addActionListener(new ActLis());
		frm.setVisible(true);
	}
	
	
	static class ActLis implements ActionListener
	{
	public void actionPerformed(ActionEvent e)
	{
		clicked=true;
		Graphics g=frm.getGraphics();
		paint(g);
	}
	public void paint(Graphics g)
	{
		if(clicked)
			g.drawRect(100, 50, 70, 55);
	}
	
}
}
