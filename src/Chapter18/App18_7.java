package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_7 extends Frame implements KeyListener,ActionListener {
	static App18_7 frm=new App18_7();
	static TextField txf=new TextField(18);
	static TextArea txa=new TextArea("",4,19,TextArea.SCROLLBARS_NONE);
	static Button btn=new Button();
	public static void main(String args[])
	{	
//		btn.setBounds(45, 65, 100, 40);
		frm.setSize(500,500);
		frm.setTitle("Key Event");
		
		frm.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		txf.addKeyListener(frm);
		txa.setEditable(false);
		
		btn.setLabel("Exit");
		btn.setBackground(Color.yellow);
		
		btn.addActionListener(frm);
		
		frm.add(btn);
		frm.add(txf);
		frm.add(txa);
		
		frm.setVisible(true);
	}
		
	public void keyPressed(KeyEvent e)
	{
		txa.setText("");
		txa.append("keyPressed() called\n");
	}
	
	public void keyReleased(KeyEvent e)
	{
		txa.append("keyReleased() called\n");
	}
	
	public void keyTyped(KeyEvent e)
	{
		txa.append("keyTyped() called\n");
	}
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
}
