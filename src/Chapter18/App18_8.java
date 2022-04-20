package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class App18_8 extends Frame
{
	static App18_8 frm=new App18_8();
	static TextField txf=new TextField(18);
	static TextArea txa=new TextArea("",4,19,TextArea.SCROLLBARS_NONE);
	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setTitle("Key Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		txf.addKeyListener(new KeyLis());
		txa.setEditable(false);
		
		frm.add(txf);
		frm.add(txa);
		frm.setVisible(true);
	}
	
	static class KeyLis extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			txa.setText("");
			if(e.isActionKey())
				txa.append("Action key is predded\n");
			else
				{
				txa.append(e.getKeyCode()+" is pressed\n");
				txa.append(e.getKeyChar()+" is pressed\n");
				}
		}
	}
}
